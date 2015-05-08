package EJ.examples;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;


public class Wrapper<T> { 
	private T wrapped ; 
	public Wrapper (T arg) {wrapped = arg;} 

	
	public void uncheckedwarningmethod(List list) {
		list.add("abc");				// unchecked warning
		list.add(new Integer(3));		// unchecked warning
	}
	
	public Wrapper <T> clone() { 
		Wrapper<T> clon = null; 
		try {  
			// type erasure 속성에 의해서 런타임에 <T>가 사라지기 때문에, 컴파일러가 런타임에 정확한 타입 정보를 알 수 없음.
			clon = (Wrapper<T>) super.clone(); // unchecked warning
			
			// 캐스팅 정보는 런타임시에도 계속 남아 있기 때문에 가능.
			Object obj = new String("abc");
			String str = (String)obj; 
			
		} catch (CloneNotSupportedException e) {  
			throw new InternalError();  
		} 
		try {  
			Class<?> clzz = this.wrapped.getClass(); 
			Method   meth = clzz.getMethod("clone", new Class[0]); 
			Object   dupl = meth.invoke(this.wrapped, new Object[0]); 
			clon.wrapped = (T) dupl; // unchecked warning 
		} catch (Exception e) {} 
		return clon; 
	} 
} 
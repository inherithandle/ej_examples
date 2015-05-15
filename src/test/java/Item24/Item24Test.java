package Item24;

import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.Test;


public class Item24Test {
	
	@Test
	public void uncheckedConversion() {
		Set<String> strings = new HashSet();					// unchecked conversion warning
	}
	
	public Set<String> uncheckedConversionMethod(Set hiHash) {
	     Set<String> strings = hiHash; 							// unchecked conversion warning
	     return strings;
	}
	
	
	
	@Test
	public void uncheck_conversion_warning이_나중에_런타임익셉션() {
		Set set = new HashSet();
		set.add(new Integer(10));		// unchecked method invocation warning.
		Set<String> strings = uncheckedConversionMethod(set);	// unchecked conversion warning.
		for(String string : strings) {		// runtime exception
			System.out.println(string);
		}
	}
	
	public void warningAdd(Set set) {
		set.add("Hi warning.");				// unchecked method invocation warning.
		// 실제로 set이 Set<String>인지, Set<Integer>인지 모름.
		// 나중에 "Hi warning."을 꺼낼 때 런타임 익셉션이 발생할 수 있다. 
	}
	
	@Test
	public void typecastexception() {
	     Object obj      	=    new String("abc");
	     String string    	=  		(String)obj;               // OK
	     Integer integer    =	(Integer)obj;            // TypeCastException.
	}
	
	public class Stack<E> {
	     private E[] elements;
	     private int size = 0;
	     private static final int DEFAULT_INITIAL_CAPACITY = 16;
	     
//	     @SuppressWarnings("unchecked")
	     public Stack() { 
	    	 elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY]; 	// unchecked cast warning.
	     }
	     

	     public void push(E e) {
	    	 elements[size++] = e;
	     }
	     
	     public E pop() {
	    	 if (size == 0)
	    		 throw new EmptyStackException();
	    	 E result = (E) elements[--size];
	    	 elements[size] = null;
	    	 return result;
	     }
	     
	    
	     
	     
	}

	
}


package EJ.examples;

import java.util.List;

import org.junit.Test;


public class Things {

	@Test(expected=ArrayStoreException.class)
	public void arrayStoreExceptionTest() {
		Object[] objects = new Integer[10];
		objects[0] = new String("Hi, exception.");				// ArrayStoreException
	}
	
	
	public void arrayOfGenericsType() {
//		Object[] objects = new List<String>[10];				// type erasure 속성에 의해 List<String>이 지워지고 Object로 대체됨.
//		objects[0] = "ABC"; 									
	}
	
	@Test(expected=ClassCastException.class)
	public void typeMismatchException() {
		Object obj      	=    new String("abc");
	    String string    	=    (String)obj;               // OK
	    Integer integer   	=    (Integer)obj;            // TypeCastException.
	}
}

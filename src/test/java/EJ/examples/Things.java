package EJ.examples;

import org.junit.Test;


public class Things {

	@Test(expected=ArrayStoreException.class)
	public void arrayStoreExceptionTest() {
		Object[] objects = new Integer[10];
		objects[0] = new String("Hi, exception.");				// ArrayStoreException
	}
	
	@Test
	public void arrayOfGenricsType() {
//		Object[] = new List<String>[10];
	}
	
}

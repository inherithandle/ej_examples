package Item26;


import org.junit.Test;
import EJ.examples.Wrapper;

public class Item26Test {
	
	@Test
	public void unchecked() {
		Wrapper<Integer> integer;
	}
	
	@Test
	public void typecastexception() {
		Object obj 		= 	new String("abc");
		String string 	= 	(String)obj;
		Integer integer =	(Integer)obj;	
		
	}
}

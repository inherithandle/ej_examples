package Item28;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;


public class Item28Test {
	@Test
	public void method() {
		Set<Integer> s1 = new HashSet<Integer>();
		Set<Integer> s2 = new HashSet<Integer>();
		Set<Number> union = this.<Number>myUnion(s1, s2);
		
	}
	
	public <E> Set<E> myUnion(Set<? extends E> s1, Set<? extends E> s2) {
   	 Set<E> hashSet = new HashSet<E>();
   	 return hashSet;
    }
	
	public void integer_double_비교가능한지() {
		Number number = new Integer(10);
		Number number2 = new Double(10.5);
		
	}
}

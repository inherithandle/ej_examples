package Item27;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class Item27Test {
	public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
		Set<E> result = new HashSet<E>(s1); result.addAll(s2);
		return result;
	}
	
	@Test
	public void genericMethodTest() {
		Set<String> s1 = new HashSet<String>();
		Set<String> s2 = new HashSet<String>();
		Set<Integer> s3;
		
		Item27Test.<String>union(s1, s2);
		Item27Test.<String>union(s1, s2); 
		
	}
	
	@Test
	public void cooll() {
		List<String> strings = new ArrayList<String>();
		strings.add("a");
		strings.add("b");
		strings.add("c");
		Collections.reverseOrder();
		
	}
	
	public interface UnaryFunction<T> {
		T apply(T arg);
	}
	
	private static UnaryFunction<Object> REVERSE_FUNCTION = new UnaryFunction<Object>() {
		public Object apply(Object arg) { return arg; }
	};
	
}

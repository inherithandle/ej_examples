package Item23;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.junit.Test;

public class Item23Test {

	@Test
	public void 임의의_객체담는_컬렉션API_ListObject_사용하자() {
		List<String> strings = new ArrayList<String>();
		unsafeAdd(strings, new Integer(42));
		String s = strings.get(0);
	}
	
	private static void unsafeAdd(List list, Object o) {
		list.add(o);	// List<String>, List<Integer> 일수도 있고, Object는 String, Integer, Double일지 모름.. unchecked warning.
	}
	
	static int numElementsInCommon(Set s1, Set s2) {
		int result = 0;
		for (Object o1 : s1) {
			if (s2.contains(o1))
				result++;
		}
		return result;
	}
	
	// raw type을 사용하면 어떠한 원소도 넣을 수 있다. 만약 클라이언트가 Set<String>을 인자로 넘겨도
	// Integer를 Set에 넣을 수 있다. Set<?>을 이용하면 컬렉션에 다른 원소를 넣는것을 막을 수 있다. null은 넣을 수 있다. 
	
}

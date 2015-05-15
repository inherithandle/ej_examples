package Item27;

import java.util.HashSet;
import java.util.Set;

public class MySetUtil {

	public static Set union(Set s1, Set s2) {
		Set result = new HashSet(s1);
		result.addAll(s2);
		return result;
	}
	
	// 실수로 set<String>, set<Integer> 넣을 수 있다?
	// MySetUtil.union(s1, s2); 
	
}

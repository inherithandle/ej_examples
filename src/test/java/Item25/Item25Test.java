package Item25;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import EJ.examples.RealClass;

public class Item25Test {
	
	// 제대로 만듬.
	@Test
	public void 임의의_객체담는_컬렉션API_ListObject_사용하자() {
		List<String> strings = new ArrayList<String>();
		unsafeAdd(strings, new Integer(42));
		
		String s = strings.get(0);
	}
	
	private static void unsafeAdd(List list, Object o) {
		list.add(o);	// List<String>, List<Integer> 일수도 있고, Object는 String, Integer, Double일지 모름.. unchecked warning.
	}
	
	
	
	
	
	
	
	
	
	
	
	// 이하 연습용
	
	@Test
	public void 서프레스() {
		ArrayList<Integer> ints = new ArrayList<Integer>();
		
		Integer[] newInts = new Integer[10];
		
		
		ints.add(0);
		ints.add(10);
		
		Integer[] hi = ints.<Integer>toArray(newInts);
		String[] hi2 = new String[10];
		// 절대 타입 미스매치가 날 수 없음.
		ints.toArray(hi2); // 
		
	}
	
	public <E> void hi(List<E> list) {
		E[] snapshot = (E[])list.toArray(); // type erasure에 의해 e가 사라지기 때문에 컴파일러 입장에서 type check를 하지못함.
		
	}
	
	@Test
	public void listObject() {
		List<Object> list = new ArrayList<Object>();
		
		list.add(new String("abcd"));
		list.add(new Integer(33));
	}
	

	@Test
	public void 서브클래스호출테스트() {
		String a = new String("abcd");
		Object obj = a;
		Object obj2 = new Object();
		System.out.println(a.toString());
		System.out.println(obj.toString());
		System.out.println(obj2.toString());
	}
	
	public void unboundedMethod(List<?> list) {
//		list.add(new String("abcd"));
//		list.add(new Integer(33));
	}
	
	public void classLiteral() {
		List<String> strings = new ArrayList<String>();
		String a = "ABc";
		Class b = List.class;
		
	}
	
//	@Test
	public void genericarraytest() {
		Object [] objects = new Object[10];
		objects[0] = new String("abcd");
		Integer integer = new Integer(3);
		Double realNumber = ((Integer)objects[0]).doubleValue();
	}
	
	@Test
	public void arraystoreexceptiontest() {
//		Object[] objects = new Integer[10];
//		objects[0] = new String("AbcD");
		
		Object[] objects = new Integer[10];
		
		objects[0] = "hi, exception";
	}
	
	@Test
	public void item25ex1() {
		List<String> strings = new ArrayList<String>();
		unsafeAdd(strings, new Integer(42));
		Object s = strings.get(0);
	}

	
	@Test
	public void item25ex2() {
		Set<Object> s1 = new HashSet<Object>();
		Set<Object> s2 = new HashSet<Object>();
		Set<String> s3 = new HashSet<String>();
		numElementsInCommon(s1, s3);
	}
	
	private int numElementsInCommon(Set<?> s1, Set<?> s2) {
		int result = 0;
		for (Object o1 : s1) 
			if (s2.contains(o1))
				result++;
		
		return result;
	}
	
	@Test
	public void 서브클래스() {
		Object realClass = new RealClass("message");
		
		System.out.println(realClass.toString());
	}
	
	@Test
	public void uncheckedconversion() {
//		List rawBox = new ArrayList();
//		List<Integer> intBox = rawBox;
		
		List<String> stringBox = new ArrayList<String>();
		List rawBox = stringBox;
		rawBox.add(8);
	}
	
}


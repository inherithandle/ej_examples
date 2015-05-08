package Item24;

import java.util.EmptyStackException;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;


public class Item24Test {
	
	@Test
	public void uncheckedConversion() {
		Set<String> strings = new HashSet();					// unchecked conversion warning
	}
	
	public void uncheckedConversionMethod(HashSet hiHash) {
	     Set<String> strings = hiHash; 							// unchecked conversion warning
	}
	
	
	public class Stack<E> {
	     private E[] elements;
	     private int size = 0;
	     private static final int DEFAULT_INITIAL_CAPACITY = 16;
	     
	     @SuppressWarnings("unchecked")
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
	
	public void warningAdd(Set set) {
		set.add("Hi warning.");				// unchecked method invocation warning.
	}
}

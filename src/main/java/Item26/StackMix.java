package Item26;

import java.util.Arrays;
import java.util.EmptyStackException;



// 2번째 방법
public class StackMix<E> {
	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	public StackMix() {
		elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}

	public void push(E e) {
		ensureCapacity();
		elements[size++] = e;
	}

	public E pop() {
		if(size ==0)
			throw new EmptyStackException();
		E result = (E) elements[--size];
		elements[size] = null;
		return result;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	private void ensureCapacity() {
		if(elements.length == size)
			elements = Arrays.copyOf(elements, 2*size+1);
	}
}

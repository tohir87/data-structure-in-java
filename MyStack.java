package __stackQueue;

import java.util.Iterator;

public class MyStack<E> implements Stack<E> {
	
	protected int capacity; // The actual capacity of the stack array 
	public static final int CAPACITY = 7; //upper bound of stack
	protected E S[]; 		// Generic array used to implement the stack
	protected int top = -1;
	
//	public MyStack(){
//		this(CAPACITY);	// default capacity
//	}

	public MyStack(int cap) {
		capacity = cap;
		S = (E[]) new Object[capacity];
	}

	@Override
	public boolean push(E x) {
		if (!full()) {
			// push element;
			S[++top] = x; 
			return true;
		}else{
			System.out.println("Stack is full");
		}
		return false;
	}

	@Override
	public boolean pop() {
		if (empty())
			return false;
		S[top--] = null;
		return true;
	}

	@Override
	public E top() {
		return S[top];
	}

	@Override
	public boolean empty() {
		return (top < 0);
	}

	@Override
	public boolean full() {
		return (top + 1 == capacity);
	}

	@Override
	public Iterator<E> iterator() {
		return null;
	}
	
	/**
	 * Return the size of the array
	 * @return
	 */
	public int size(){
		return top + 1;
	}
	
	public String toString(){
			String s; 
			s = "[";
			if (size() > 0) s += S[0];
			if (size() > 1)
				for (int i=1; i <= size() -1; i++) {
					s += ", " + S[i];
				}
			return s + " ]";
	}

}

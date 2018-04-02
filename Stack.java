package __stackQueue;

import java.util.EmptyStackException;
import java.util.Iterator;

public interface Stack<E> {
	
	/**
	 * Insert an element at the top of the stack
	 * @param x element to be inserted
	 * @return
	 */
	public boolean push(E x);
	
	/**
	 * Remove the top element from the stack
	 * @return element removed
	 * @exception EmptyStackException if the stack is empty
	 */
	public boolean pop();
	
	/**
	 * Inspect the element at the top of the stack
	 * @return top element in the stack
	 */
	public E top();
	
	/**
	 * Return whether the stack is empty
	 * @return true if the stack is empty, false otherwise
	 */
	public boolean empty();
	
	/**
	 * Return whether the stack if full
	 * @return true if the stack if full, false otherwise
	 */
	public boolean full();
	
	public Iterator<E> iterator();
}

package __stackQueue;

public class StackTest {

	public static void main(String[] args) {
		
		// the default constructor takes in the upper bound of the stack array
		// i.e The limit of the stack
		MyStack<Integer> A = new MyStack<Integer>(4); 
		
		// display the element at the top of the stack while still empty
		System.out.println(A.top());
		
		// Pushing items to the top of the stack
		A.push(7);
		A.push(3);
		A.push(5);
		
		// Display the content of the stack
		System.out.println(A.toString());
		
		// remove an item from the stack
		A.pop();
		
		//Display the content of the stack
		System.out.println(A.toString());
		
		// display the element at the top of the stack
		System.out.println(A.top());
		
		// Adding more items to the stack
		A.push(19);
		A.push(23);
		A.push(15);
		
		System.out.println(A.toString());

	}

}

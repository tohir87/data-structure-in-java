package __stackQueue;

public class StackTest {

	public static void main(String[] args) {
		
		MyStack<Integer> A = new MyStack<Integer>(4); 
		
		A.push(7);
		A.push(3);
		A.push(5);
		
		System.out.println(A.toString());
		
		A.pop();
		System.out.println(A.toString());
		
		System.out.println(A.top());
		A.push(7);
		A.push(3);
		A.push(5);
		
		System.out.println(A.toString());

	}

}

/**
 * 
 */
package mystack;

/**
 * @author Betsy Gorelik and Marty Roger 
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete
		T pop = theStack.val;
		theStack = theStack.next;
		return pop;
	}

	public void push(T v) {
		theStack = new MyNode<T>(v, theStack);
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		// Push 1 and 2
		// Pop
		// Push 5
		MyStack<Integer> intStack = new MyStack<Integer>();
		intStack.push(1);
		intStack.push(2);
		intStack.pop();
		intStack.push(5);
		
		// TODO To complete
		// Create a stack of Person
		// Push a person p1 with your name
		// Push a person p2 with my name
		MyStack<Person> perStack = new MyStack<Person>();
		String b = "Betsy";
		String g = "Gorelik";
		String c = "Christelle";
		String s = "Scharff";
		Person p1 = new Person(b, g);
		Person p2 = new Person(c, s);
		perStack.push(p1);
		perStack.push(p2);
	}

}

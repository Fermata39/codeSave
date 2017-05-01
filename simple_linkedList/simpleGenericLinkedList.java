import java.util.ArrayList;
import java.util.Arrays;

public class simpleGenericLinkedList {

	public static void main(String[] args) {
		genStack gStack = new genStack();

		gStack.push(5);
		gStack.push(3);
		gStack.push(1);
		gStack.push(3);
		gStack.push(4);

		gStack.print();

		gStack.pop();
		gStack.pop();
		gStack.pop();

		gStack.print();

		gStack.push("1");
		gStack.push("3");
		gStack.push("4");

		gStack.print();

	}
}

class genStack<E> {
	ArrayList<E> stack;

	public genStack() {
		// TODO Auto-generated constructor stub
		stack = new ArrayList<>();
	}

	public void push(E item) {
		stack.add(0, item);
	}

	public void pop() {
		stack.remove(0);
	}

	public void print() {
		System.out.println("Gen Stack: " + stack.toString());
	}

}

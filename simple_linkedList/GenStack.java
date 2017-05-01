import java.util.ArrayList;

public class GenStack<T> {

	ArrayList<T> stack;

	public GenStack() {
		// TODO Auto-generated constructor stub
		stack = new ArrayList<>();
	}

	public static void main(String[] args) {
		GenStack<Object> gs = new GenStack<>();

		gs.push(5);
		gs.push(3);
		gs.push(1);
		gs.push(2);
		gs.push(4);

		System.out.println("Generic Stack2: " + gs.stack.toString());

		gs.pop();
		gs.pop();
		gs.pop();

		System.out.println("Generic Stack2: " + gs.stack.toString());

	}

	public void push(T item) {
		stack.add(0, item);
	}

	public T pop() {
		return stack.remove(0);
	}
}

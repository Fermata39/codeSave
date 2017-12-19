import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueSample<T> {

	Stack<T> stack1;
	Stack<T> stack2;

	public QueueSample() {
		stack1 = new Stack<T>();
		stack2 = new Stack<T>();
	}

	public void offer(T element) {
		stack1.push(element);
	}

	public T poll() {
		while(!stack1.isEmpty()){
			stack2.push(stack1.pop());
		}

		return stack2.pop();
	}

	public int size() {
		return stack2.size();
	}

	public Queue<T> reverseQ(Queue<T> q) {
		Stack<T> st = new Stack<T>();
		Queue<T> reverseQ = new LinkedList<T>();

		int size = q.size();
		for (int i = 0; i < size; i++) {
			st.push(q.poll());
		}

		for (int i = 0; i < size; i++) {
			reverseQ.offer(st.pop());
		}

		return reverseQ;
	}

	public Queue<T> reverseQ2(Queue<T> q) {
		Stack<T> st = new Stack<T>();

		while (!q.isEmpty()) {
			st.push(q.poll());
		}

		while (!st.isEmpty()) {
			q.offer(st.pop());
		}

		return q;
	}

	public static void main(String[] args) {
		QueueSample qs = new QueueSample();

		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(3);
		q.offer(1);
		q.offer(2);

		System.out.println("Q print1:" + qs.reverseQ(q));

		q.offer(3);
		q.offer(1);
		q.offer(2);
		System.out.println("Q print2:" + qs.reverseQ2(q));

		qs.offer(3);
		qs.offer(1);
		qs.offer(2);
		System.out.println("myQ: " + qs.poll());
		System.out.println("myQ: " + qs.poll());
		System.out.println("myQ: " + qs.poll());

	}
}

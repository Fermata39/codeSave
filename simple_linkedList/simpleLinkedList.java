import java.util.*;

public class simpleLinkedList{
	public static void main(String[] args){

		ArrayList<Integer> stack = initStack();

		push(stack,5); //first input
		push(stack,3);
		push(stack,1);
		push(stack,2);
		push(stack,4); //last input

		System.out.println("Stack-before: " + stack.toString());
		System.out.println("pop1: " + pop(stack));
		System.out.println("pop2: " + pop(stack));
		System.out.println("pop3: " + pop(stack));
		System.out.println("Stack-after: " + stack.toString());

	}

	public static ArrayList<Integer> initStack(){
		return new ArrayList<Integer>();
	}

	public static void push(ArrayList<Integer> stack, int num){
		stack.add(0,num);
	}

	public static int pop(ArrayList<Integer> stack){
		return stack.remove(0);
	}

}

import java.util.*;

public class singleLinkedList{
	public static void main(String[] args) {

		List list = new List();

		System.out.println("<list add>");
		list.addNode(3);
		list.addNode(5);
		list.addNode(7);
		list.addNode(1);
		list.addNode(2);

		list.printList();

		System.out.println("<node search>");
		list.search(7);

		System.out.println("<node first node remove>");
		list.remove(2);
		list.printList();

		System.out.println("<node selected node remove>");
		list.remove(7);
		list.printList();
	}
}

class List {
	Node head;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
			next = null;
		}
	}

	public void addNode(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public void printList() {

		Node temp = head;
		while (temp != null) {
			System.out.println("print: " + temp.data);
			temp = temp.next;
		}
		System.out.println();
	}

	public void search(int data) {
		Node temp = head;

		System.out.println("serach Data: " + data);

		while (temp != null) {
			if (temp.data == data) {
				System.out.println("Match Data");
			}
			temp = temp.next;
		}
		System.out.println();
	}

	public void firstRemove() {
		Node first = getNode(0);
		Node temp = head;

		temp = first.next;
		temp.next = first.next.next;
		head = temp;

	}

	public void remove(int data) {
		Node temp = head;

		int index = getIndex(data);

		if (index == 0) {
			System.out.println("enter first Remove Data: " + data);
			firstRemove();
			return;
		}

		System.out.println("enter selected Remove Data: " + data);
		System.out.println("index: " + index + " data: " + data);
		Node prev = getNode(index - 1);
		Node remove = prev.next;
		Node next = remove.next;
		prev.next = next;

		System.out.println();
	}

	public Node getNode(int index) {

		Node temp = head;

		int i = 0;
		while (i < index) {
			temp = temp.next;
			i++;
		}

		return temp;
	}

	public int getIndex(int data) {

		Node temp = head;

		int index = 0;
		while (temp != null) {
			if (temp.data == data) {
				return index;
			}
			temp = temp.next;
			index++;
		}

		return index;
	}
}

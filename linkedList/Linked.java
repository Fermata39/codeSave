public class Linked {
	public static void main(String[] args) {

		List list = new List();
		System.out.println("List Generating...");

		list.addNode(5); // Node insert
		list.addNode(4); // Node insert
		list.addNode(3); // Node insert
		list.addNode(2); // Node insert
		list.addNode(1); // Node insert

		list.printList();
		list.delList(3);
		list.printList();
		// int test = list.searchList(5);
		// System.out.println("search: " + test);
	}

}

class List {

	Node head;

	class Node {
		int data;
		int size;
		Node next;

		public Node(int data_org) {
			// TODO Auto-generated constructor stub
			data = data_org;
			next = null;
		}
	}

	public void addNode(int param) {

		Node Nnode = new Node(param);

		Nnode.next = head;
		head = Nnode;

	}

	public void delList(int data) {
		System.out.println("del start");

		Node tempN = head;

		while (tempN != null) {
			System.out.println("tempN.data: " + tempN.data);
			if (tempN.data == data) {
				System.out.println("del: " + tempN.data);
				tempN = tempN.next;
				tempN.next = tempN.next.next;
			} else {
				System.out.println("not match: " + tempN.data);
				tempN = tempN.next;
			}
		}
	}

	public int searchList(int n) {
		Node searchN = head;
		while (searchN != null) {
			if (searchN.data == n) {
				return searchN.data;
			} else {
				System.out.println("not match!");
				searchN = searchN.next;
			}
		}
		return searchN.data;
	}

	public void printList() {
		Node temp = head;

		while (temp != null) {
			System.out.println("res: " + temp.data);
			temp = temp.next;
		}

	}
}

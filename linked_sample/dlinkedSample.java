import java.util.*;

public class dlinkedSample{
	public static void main(String[] args){
		Node p = null;
		Node root = null;


		System.out.println("test1");
		//insret ()
		for(int i=0;i<10;i++){
			p = insert(root,p,i);	
		}

		System.out.println("test2: " + p.next.val);
		while(p.next != null){
			System.out.println("test3");
			System.out.println("p: " + p.next);
		}

		//find
		for(int i=1;i<11;i+=2){

		}

		//delete
		for(int i=2;i<10;i+=2){

		}
	}

	public static void init_node(Node node){
		node.val = 0;
		node.next = null;
		node.prev = null;
	}

	public static Node insert(Node head, Node p, int val){


		System.out.println("insert enter");
		Node node = new Node();		
		init_node(node);

		node.val = val;

		if(head != null){
			Node next = p.next;
			p.next = node;
			node.prev = p;
			node.next = next;

			if(next != null){
				next.prev = node;
			}

		}else{
			head = node;
		}

		return node;
	}
	public static Node find(Node root,int i){
		return null;
	}
	public static void delete(Node root,Node p){
	}


}

class Node{
	int val;
	Node next;
	Node prev;
}

import java.util.*;

public class reverseList{
    public static void main(String[] args){

        list list = new list();
        list.add(5);
        list.add(3);
        list.add(1);

        list.print();
        System.out.println("size: " + list.size);

        list.reverse();

        list.reverseTest(list.head);
    }
}

class list{

    Node head = null;
    int size =0;    
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }


    void add(int data){
        Node node = new Node(data);

        if(head == null){
            head = node;
        }else{
            node.next = head;
            head = node;
        }
        size++;

    }

    void print(){
        Node temp = head;
        while(temp != null){
            System.out.println("print: " + temp.data);
            temp = temp.next;
        }
    }
    void print2(Node node){
        Node temp = node;
        while(temp != null){
            System.out.println("print: " + temp.data);
            temp = temp.next;
        }
    }
    void reverse(){
        Node current = head;
        Node next = null;
        Node prev = null;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        System.out.println("reverse");
        print2(prev);
    }

    Node recursiveReverse(Node node){
        Node current = node;

        if(current == null){
            return current;
        }
        if(current.next == null){
            return current;
        }

        Node second = current.next;
        current.next = null;

        Node rest = recursiveReverse(second);
        second = current;

        return rest;
    }

    void reverseTest(Node node){
        Node temp = recursiveReverse(node);

        System.out.println("recursive reverse");
        print2(temp);
    }
}



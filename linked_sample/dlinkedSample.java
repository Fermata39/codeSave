import java.util.*;

public class dlinkedSample{
    static Node root = null;
    public static void main(String[] args){
        Node p = null;
        //Node root = null;


        System.out.println("test1");
        //insret ()
        for(int i=1;i<=10;i++){
            p = insert(root,p,i);	
        }

        System.out.println("test2: " + p.prev.val);
        while(p.next != null){
            System.out.println("test3");
            System.out.println("p: " + p.next);
        }

        //find

        p = find(root,8);
        System.out.println("find: " + p.val);

        
        //delete

        p = delete(root,p);
        System.out.println("delete: " + p.val);


        
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
            root = node;
        }

        return node;
    }
    public static Node find(Node root,int val){

        if(root == null){
            return null;
        }

        for(Node p = root;p != null;p = p.next){
            if(p.val == val){
                return p;
            }
        }

        return null;
    }
    public static Node delete(Node head,Node p){
        Node temp = p.prev;

        if(p.next !=null){
          p.next.prev = p.prev;
        }

        if(p.prev !=null){
            p.prev.next = p.next;
        }else{
            root = p.next;
        }
        
        return temp;

    }


}

class Node{
    int val;
    Node next;
    Node prev;
}

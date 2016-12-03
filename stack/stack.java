package project;
import java.util.Scanner;

public class main {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int i;
        stack st = new stack();
        StringBuilder sb = new StringBuilder();

        for(i =0; i<input.length(); i++){
            st.push(String.valueOf(input.charAt(i)));
            //sb.append(st.pop());
        }
        for(int j =0; j<input.length(); j++){
            sb.append(st.pop());
            //sb.append(st.pop());
        }

        //System.out.println("res: " + st.pop());
        System.out.println("res: " + sb.toString());
    }

}

class stack {
    String sd[] = new String[100];
    int size;

    stack() {
        size = 0;
    }

    String pop() {
        String rs = sd[size - 1];
        size--;
        return rs;
    }

    void push(String data) {
        sd[size] = data;
        size++;
    }

    boolean empty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    int top() {
        return size;
    }
}

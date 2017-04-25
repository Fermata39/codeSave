import java.util.*;

public class bracketTest{
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        //boolean flag = reverseString(in);
        boolean flag = checkBracket2(in);
        
        System.out.println("flag = " + flag);
    }

    public static boolean reverseString(String in){
    
        Stack<Character> st = new Stack<>();

        for(int i=0; i<in.length(); i++){
            st.push(in.charAt(i));
        }
        
        System.out.print(in + "-->");
        for(int i=0; i<in.length(); i++){
            System.out.print(st.pop());
        }

        System.out.println();
        return true;
    }

    public static boolean checkBracket1(String in){
        Stack<Character> st = new Stack<>();
        int cnt=0;

        for(int i=0; i<in.length();i++){
            st.push(in.charAt(i));
        }

        for(char c : st){
            if(c == '('){
                cnt++;
            }else{
                cnt--;
            }
        }

        if(cnt == 0){
           return true;
        }else{
            return false;
        }
    }

    public static boolean checkBracket2(String in){
        
        char[] check = new char[in.length()];

        int cnt=0;
        for(int i=in.length()-1; i>=0; i--){
            if(in.charAt(i) == '('){
                cnt++;
            }else{
                cnt--;
            }
        }

        if(cnt ==0){
            return true;
        }else{
            return false;
        }
    }
}


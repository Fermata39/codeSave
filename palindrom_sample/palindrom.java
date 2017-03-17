import java.util.*;

public class palindrom {

    public static void main(String[] args){

        System.out.println("input String: ");
        Scanner sc = new Scanner(System.in);

        boolean flag = is_palindrom(sc.nextLine());

        System.out.println("res flag: " + flag);

    }

    public static boolean is_palindrom(String s){
        int size = s.length();

        for(int i=0; i<size/2;i++){
            if(s.charAt(i) != s.charAt(size-i-1)){
                return false;
            }
        }

        return true;
    }
}

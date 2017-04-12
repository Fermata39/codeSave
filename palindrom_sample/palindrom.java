import java.util.*;

public class palindrom {

    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("input String: ");

      String s = sc.nextLine();

      char[] str = removeNullSpace(s);

      is_palindrom(changeToString(str));
    }

    public static void is_palindrom(String str){

      for(int i =0;i <str.length()/2; i++){
          if(str.charAt(i) != str.charAt(str.length()-i-1)){
            System.out.println("result: " + false);
            return;
          }
      }

      System.out.println("result: " + true);
    }

    public static String changeToString(char[] str){
      StringBuffer sb = new StringBuffer();

      for(char c : str){
        if(c != 0){
          sb.append(c);
        }
      }

      return sb.toString();
    }

    public static char[] removeNullSpace(String s){

      char[] str = new char[s.length()];

      for(int i=0; i<s.length(); i++){
        if(s.charAt(i) != ' '){
          str[i] = s.charAt(i);
        }
      }

      return str;
    }
}

import java.util.*;

public class comPareString{
    public static void main(String[] args){

        boolean[] check = new boolean[26];

        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();

        int index = 0;
        for(int i=0; i<in.length(); i++){

            if(check[in.charAt(i)-'a']){
                index = i;
                break;
            }else{
                check[in.charAt(i)-'a'] = true;
                index = -1;
            }
        }
        System.out.println("index: " + index); 
    }
}

import java.util.*;

public class IsUniqueTest{
    public static void main(String[] args){
        boolean flag = isUnique("abcdd");
        System.out.println("flag: " + flag);
    }

    public static boolean isUnique(String str){
        char[] ca = str.toCharArray();
        
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        int num =0 ;
        for(char c : ca){
            if(!map.containsKey(c)){
                map.put(c,num++);
            }else{
                return false;
            }
        }

        return true;
    }
}

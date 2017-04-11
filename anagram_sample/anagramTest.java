import java.util.*;

public class anagramTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("input String1:");
        String s1 = sc.nextLine();

        System.out.println("input String1:");
        String s2 = sc.nextLine();

        boolean flag = isAnagram(s1,s2);

        System.out.println("result: " + flag);
    }

    public static boolean isAnagram(String s1, String s2){
        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];

        String str1,str2;
        for(int i=0; i<s1.length();i++){
            str1 = s1.toLowerCase();
            cnt1[s1.charAt(i)-'a']+=1;
        }
        for(int i=0; i<s2.length();i++){
            str2 = s2.toLowerCase();
            cnt2[s2.charAt(i)-'a']+=1;
        }
        for(int i='a'; i<='z';i++){
            if(cnt1[i-'a'] != cnt2[i-'a']){
                return false;
            }
        }

        return true;

    }
}

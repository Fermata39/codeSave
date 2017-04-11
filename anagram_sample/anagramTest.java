import java.util.*;

public class anagramTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("input String1:");
        String s1 = sc.nextLine();

        System.out.println("input String1:");
        String s2 = sc.nextLine();

        // boolean flag = isAnagram1(s1,s2);
        // boolean flag = isAnagram2(s1,s2);
        boolean flag = isAnagram3(s1,s2);

        System.out.println("result: " + flag);
    }

    public static boolean isAnagram3(String s1, String s2){
      String str1 = isDeleteSpace(s1);
      String str2 = isDeleteSpace(s2);

      return isAnagram2(str1,str2);
    }

    public static String isDeleteSpace(String str){

      char[] temp = new char[str.length()];
      for(int i=0; i<str.length(); i++){
        if(str.charAt(i) != ' '){
            temp[i] = str.charAt(i);
        }
      }

      String data = charToString(temp);

      return data;
    }

    public static String charToString(char[] str){
      StringBuffer sb = new StringBuffer();

      for(int i=0; i<str.length; i++){
        if(str[i] != ' '){
          sb.append(str[i]);
        }
      }

      return sb.toString();
    }


    //Ascii case 고려
    public static boolean isAnagram2(String s1, String s2){
      int[] flag = new int[128]; // if ascii 일 경우

      for(int i=0; i<s1.length(); i++){
        flag[s1.toLowerCase().charAt(i)]++;
      }

      for(int i=0; i<s2.length(); i++){
        flag[s2.toLowerCase().charAt(i)]--;
        if(flag[s2.charAt(i)] < 0 ){
          return false;
        }
      }

      return true;
    }
    // 대소문자 case 고려
    public static boolean isAnagram(String s1, String s2){
        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];

        String str1,str2;
        for(int i=0; i<s1.length();i++){
            str1 = s1.toLowerCase();
            cnt1[s1.charAt(i)-'a']++;
        }
        for(int i=0; i<s2.length();i++){
            str2 = s2.toLowerCase();
            cnt2[s2.charAt(i)-'a']++;
        }
        for(int i='a'; i<='z';i++){
            if(cnt1[i-'a'] != cnt2[i-'a']){
                return false;
            }
        }

        return true;

    }
}

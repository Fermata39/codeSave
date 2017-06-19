import java.util.*;

public class StringToInt{
    public static void main(String[] args){
        convertStringToInt("123");
        convertStringToInt2("123");
    }

    public static void convertStringToInt(String num){
        
        char[] cs = num.toCharArray(); // String 을 char 배열로 변경 

        int sum =0;
        for(char c : cs){
            sum *= 10;
            sum += c-'0';//문자 0을 빼서 실제 정수형 값을 구함
        }
        // "123" 에서 
        // (1*10)+2 = 12
        // (12*10)+3 = 123
        // 위와 같이 자리 수를 통해 string 을 int 형으로 변환 시킴

        System.out.println("sum: " + sum);
    }

    public static void convertStringToInt2(String num){
    }
}

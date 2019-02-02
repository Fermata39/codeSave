
import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(reverseInteger(sc.nextLine()));
    }

    private static int reverseInteger(String x) {
        String str;
        char[] arry;
        StringBuffer sb = new StringBuffer();

//        str = Integer.toString(x);
        str = x;
        arry = new char[str.length()];


        for (int i = 0; i < str.length(); i++) {
            arry[i] = str.charAt(i);
        }

        int cnt = 0;

        for (int i = arry.length - 1; i >= 0; i--) {
            if (arry[i] == '-') {
                cnt++;
                if (sb.length() == 0)
                    sb.insert(0, arry[i]);
                else if (sb.toString().charAt(0) != '-')
                    sb.insert(0, '-');

                if (sb.toString().charAt(0) == '-' && cnt > 1)
                    continue;
            } else
                sb.append(arry[i]);
        }

//        System.out.println(Math.abs();

        try {
            if (Integer.parseInt(sb.toString()) > 0)
                return Math.abs(Integer.parseInt(sb.toString()));
            else
                return Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            System.out.println(e);
            return 0;
        }
    }
}


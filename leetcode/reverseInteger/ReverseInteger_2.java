import java.util.*;

class ReverseInteger_2 {
	public static void main(String[] args){
		System.out.println(reverse(new Scanner(System.in).nextInt()));
	}

    public static int reverse(int x) {
        int pop = 0;
        int rev = 0;

        while (x != 0) {
            pop = x % 10;
            x /= 10;
            
            if(rev > Integer.MAX_VALUE / 10 ) return 0;
            if(rev < Integer.MIN_VALUE / 10 ) return 0;
            
            rev = rev * 10 + pop;
        }

        return rev;
        
    }
}

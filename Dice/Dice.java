import java.util.*;

public class Dice{
	public static void main(String[] args){

		System.out.println("Input Dice Ways: ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Ways: " + countWays(sc.nextInt()));
	}

	public static int countWays(int num){

		if(num < 0){
			return 0;
		}

		if(num == 0){
			return 1;
		}

		return countWays(num-1) + countWays(num-2) + countWays(num-3)+
			countWays(num-4) + countWays(num-5) + countWays(num-6);	
	}
}

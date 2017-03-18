import java.util.*;

public class primeTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("input prime: ");
		boolean flag = is_prime(sc.nextInt());

		System.out.println("prime res: " + flag);
	}

	public static boolean is_prime(int sc){

		if(sc < 2){
			return false;
		}

		for(int i=2; i<=sc-1; i++){
			if(sc%i == 0){
				return false;
			}
		}

		return true;
	}
}

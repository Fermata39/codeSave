import java.util.*;

public class CharToNumber{
	public static void main(String[] args){
		System.out.print("Input Char : ");
		Scanner sc = new Scanner(System.in);

		getCharNumber(sc.next().charAt(0));
	}

	public static void getCharNumber(Character ch){

		if(ch == ' '){
			System.out.println("No Charactor");
			return;
		}

		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int val = Character.getNumericValue(ch);

		System.out.println("Before Convert: " + val);

		if(a <= val && val <= z){
			System.out.println("Output : "  + (val-a));
			return;
		}

		System.out.println("No Charactor");
		return;

	}
}

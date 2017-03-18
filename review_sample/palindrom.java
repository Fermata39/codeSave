import java.util.*;

public class palindrom{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		boolean flag = is_palindrom(sc.nextLine());
		System.out.println("flag: "+ flag);
	}

	public static boolean is_palindrom(String str){

		int size = str.length();
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) != str.charAt(size-i-1)){
				return false;		
			}
		}

		return true;
	}

}

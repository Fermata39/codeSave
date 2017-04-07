import java.util.*;

public class unique_char{
	public static void main(String[] args){
		String[] str = {"apple","test","help"};
		
		for(int i=0;i<str.length;i++){
			System.out.println("result: " + isunique(str[i]));
		}
	}

	public static boolean isunique(String str){
		if(str.length() > 128){
			return false;
		}

		boolean[] checkItem = new boolean[128];

		for(int i=0; i<str.length(); i++){
			int val = str.charAt(i);
			System.out.println("val1: " + val);

			if(checkItem[val]) {
				System.out.println("val2: " + val);
				return false;
			}
			checkItem[val] = true;

		}
		return true;
	}
}

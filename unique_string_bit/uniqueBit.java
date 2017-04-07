import java.util.*;

public class uniqueBit{
	public static void main(String[] args) {
			String[] strs = {"adde", "method", "test"};

			for(String str : strs)
			System.out.println("result: " + isUnique(str));
	}

	public static boolean isUnique(String str){
		if(str.length() >26){
			return false;
		}

		int checker = 0;
		for(int i =0; i<str.length(); i++){
			int val = str.charAt(i) - 'a';
			System.out.println("checker1: " + checker + " val1: " + val);
			if((checker & (1 << val)) >0){
				return false;
			}else{
				checker |= (1 << val);
			}
				System.out.println("checker2: " + checker + " val2: " + val);
		}

		return true;
	}
}

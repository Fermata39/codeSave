import java.util.*;

public class CharToString{
	public static void main(String[] args){

		char[] arr = new char[5];

		arr[0] = 'a';
		arr[1] = 'p';
		arr[2] = 'p';
		arr[3] = 'l';
		arr[4] = 'e';


		changeToString(arr);

	}

	public static void changeToString(char[] arr){
		StringBuffer sb = new StringBuffer(arr.length);

		for(char c : arr){
			if(c == 0){
				break;
			}
			sb.append(c);
		}

		System.out.println("result: " + sb.toString());
	}
}

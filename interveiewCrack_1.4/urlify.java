import java.util.*;

public class urlify {
	public static void main(String[] args){
		String str = "Mr John Smith    ";
		char[] text = new char[str.length()];

		for(int i =0;i<str.length(); i++){
			text[i] = str.charAt(i);
		}

		int truelength = isTrueLength(text)+1;
		System.out.println("truelength:" + truelength);

		replaceSpaces(text,truelength);

	}

	public static void replaceSpaces(char[] text , int truelength){
		int nullspace = isCheckSpace(text,truelength);
		System.out.println("null: " + nullspace);

		int index = truelength + (nullspace*2);
		System.out.println("index: " + index);

		text[truelength]='\0';

		for(int i = truelength - 1; i >= 0; i--){
			if(text[i] == ' '){
				text[index-1] = '0';
				text[index-2] = '2';
				text[index-3] = '%';

				index -=3;
			}else{
				// index--;
				text[index-1] = text[i];
				index--;
			}
		}

		charToString(text);

	}

	public static void charToString(char[] strs){
		StringBuffer sb = new StringBuffer();

		for(char str : strs){
			if(str != ' '){
				sb.append(str);
			}
		}

		System.out.println("result: "+ sb.toString());
	}

	public static int isTrueLength(char[] str){

		int cnt = 0 ;
		for(int i=str.length-1; i >= 0; i--){
			if(str[i] != ' '){
				return i;
			}
		}

		return -1;
	}

	public static int isCheckSpace(char[] text,int truelength){
		int cnt = 0;
		for(int i=0; i<truelength; i++){
			if(text[i] == ' '){
				cnt++;
			}
		}

		return cnt;
	}
}

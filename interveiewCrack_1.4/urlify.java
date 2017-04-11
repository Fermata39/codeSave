import java.util.*;

public class exercise{
	public static void main(String[] args){
		String input = "Mr Jone Smith ";
		char[] str = convertToChar(input);
		int truelength = calTrueLength(str)+1;
		int nullCnt = calNullCnt(str,truelength);

		replaceSpaces(str,nullCnt,truelength);
	}

	public static void replaceSpaces(char[] str, int nullCnt, int truelength){

		int index = truelength + (nullCnt*2);
		char[] temp = new char[index];
		str[truelength] = '\0';

		for(int i = truelength-1; i>=0; i--){
			if(str[i] == ' '){
				temp[index-1] = '0';
				temp[index-2] = '2';
				temp[index-3] = '%';

				index -=3;
			}else{
				temp[index-1] = str[i];
				index--;
			}
		}
		charToString(temp);
	}

	public static void charToString(char[] str){
		StringBuffer sb = new StringBuffer();

		for(char ch : str){
			if(ch != ' '){
				sb.append(ch);
			}
		}

		System.out.println("result: " + sb.toString());

	}

	public static int calNullCnt(char[] str , int truelength){
		int cnt = 0;
		for(int i =0; i<truelength; i++){
			if(str[i] == ' '){
				cnt++;
			}
		}

		return cnt;
	}

	public static int calTrueLength(char[] str){

		for(int i = str.length-1; i>=0; i--){
			if(str[i] != ' '){
				return i;
			}
		}

		return -1;
	}

	public static char[] convertToChar(String input){

		char[] str = new char[input.length()];
		for(int i=0; i<input.length(); i++){
			str[i] = input.charAt(i);
		}

		return str;
	}
}


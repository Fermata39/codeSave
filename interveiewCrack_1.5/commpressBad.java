import java.util.*;

public class commpressBad{
	public static void main(String[] args){
		// String str = "aaabc";
		Scanner sc = new Scanner(System.in);

		System.out.println("Input Line:");
		String str = sc.nextLine();
		isCheckStr(str);
		isCheckStr2(str);
		isCheckStr3(str);

	}

	public static void isCheckStr3(String str){
		char ch = ' ';
		int cnt = 1;
		char[] ca = str.toCharArray();
		StringBuffer sb = new StringBuffer();

		if(str.length() == 0){
			return;
		}

		for( int i=1 ; i<str.length(); i++){
			ch = ca[i-1];

			if(ch == ca[i]){
				cnt++;
			}else{
				sb.append(String.valueOf(ch)).append(cnt);
				cnt = 1;
			}
		}
		
		sb.append(String.valueOf(ch)).append(cnt);
		System.out.println("result3: " + sb.toString());

	}

	public static void isCheckStr2(String str){
		char buf = 0;
		StringBuffer out = new StringBuffer();
		int cnt =0;

		for(int i=0; i<str.length(); i++){
			if(buf == 0){
				buf = str.charAt(i);
				out.append(buf);
				cnt++;
			}else{
				if(buf != str.charAt(i)){
					//이전에 같은 문자열에서 다른 문자열이 들어온 것으로 판단
					out.append(cnt);
					cnt = 1;
					buf = str.charAt(i);
					out.append(buf);
				}else{
					cnt++;
				}
			}
		}
		out.append(cnt);


		System.out.println("result2: " + out.toString());
	}

	public static void isCheckStr(String str){

		int cnt=0;
		StringBuffer sb = new StringBuffer();

		System.out.println("length: " + str.length());
		for(int i=0; i<str.length(); i++){
			cnt++;
			if(i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)){
				sb.append(str.charAt(i));
				sb.append(cnt);
				cnt=0;
			}
		}

		System.out.println("result1: " + sb.toString());
	}
}

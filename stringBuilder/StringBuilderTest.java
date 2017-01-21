
public class StringBuilderTest {
	public static void main(String[] args) {
		String text= "abcdefghijk";

		StringBuilder sb = new StringBuilder();

		for(int i = text.length()-1 ; i >= 0; i--){
			sb.append(text.charAt(i));
		}

		System.out.println("res1: " + sb.toString());
		System.out.println("res2: " + sb.reverse());

		StringBuilder sb2 = new StringBuilder(text); // stringbuilder 로 로딩 할 때 부하가 줄어든

		System.out.println("res3: " + sb2.toString());
		System.out.println("res4: " + sb2.reverse());

	}
}


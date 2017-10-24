
/**
 * Created by shinkook_mac on 2017. 10. 24..
 */
public class ConvertSample {
	public static void main(String[] args) {

		System.out.println("res: " + convert("123"));

	}

	public static int convert(String s) {
		char[] cs = s.toCharArray();
		int num = 0;

		for (char c : cs) {
			num *= 10;
			num += c - '0';
		}

		char t = '1';
		int num2 = t - '0';
		System.out.println("test1: " + num2);
		System.out.println("test2: " + (t - '0'));
		return num;
	}
}


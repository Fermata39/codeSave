import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class fizzBuzz {
	public static void main(String[] args) {
		System.out.println("result: " + alternativeFizzBuzz(15).toString());
	}

	public static List<String> alternativeFizzBuzz(final int n) {
		final List<String> toReturn = new ArrayList<>();

		for (int i = 0; i <= n; i++) {
			final String word = toWord(3, i, "Fizz") + toWord(5, i, "Buzz");

			if (StringUtils.isEmpty(word)) {
				toReturn.add(Integer.toString(i));
			} else {
				toReturn.add(word);
			}
		}

		return toReturn;
	}

	public static String toWord(final int divisor, final int value, final String word) {

		return value % divisor == 0 ? word : "";
	}
}


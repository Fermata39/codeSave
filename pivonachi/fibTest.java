package fibN.sample;

public class fibTest {

	public static int fibN(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("n must be less than zero");
		}

		if (n == 1)
			return 1;
		if (n == 0)
			return 0;

		return (fibN(n - 1) + fibN(n - 2));
	}
}


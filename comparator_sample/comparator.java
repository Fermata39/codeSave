package exercise.sample;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparator {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(5, 4, 2, 1, 3);
		List<Integer> expected = Arrays.asList(3, 5, 1, 4, 2);

		Collections.sort(number, new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub

					return o1.compareTo(o2);
				}
		});

		System.out.println("number res:" + number.toString());

		Collections.sort(expected, new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
					return o1-o2;
				}

		});

		System.out.println("expected res: " + expected.toString());
	}

}


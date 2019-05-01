package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomantoInteger {

	public static void main(String[] args) {
		RomantoInteger r = new RomantoInteger();

		System.out.println(r.romanToInt(r.input()));
	}

	private int romanToInt(String s) {

		Map<Character, Integer> map = new HashMap<>();
		int sum = 0;

		map.put('M', 1000);
		map.put('D', 500);
		map.put('C', 100);
		map.put('L', 50);
		map.put('X', 10);
		map.put('V', 5);
		map.put('I', 1);


		int len = s.length() - 1;
		sum += map.get(s.charAt(len));

		for (int i = len; i >= 0; i--) {

			if(i == 0) break;

			if (map.get(s.charAt(i -1)) >= map.get(s.charAt(i))) {
				sum += map.get(s.charAt(i - 1));
			} else {
				sum = sum - map.get(s.charAt(i -1));
			}
		}


		return sum;
	}

	private String input() {
		Scanner in = new Scanner(System.in);
		return in.nextLine();
	}
}


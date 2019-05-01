package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		PalindromeNum p = new PalindromeNum();

		System.out.println(p.isPalindrome(p.input()));
	}

	private boolean isPalindrome(int x) {

		if (x < 0) return false;

		int rev = 0;
		List list = new ArrayList();


		while (x != 0) {
			rev = x % 10;
			x = x / 10;
			list.add(rev);
		}
		int len = list.size() - 1;
		for (int i = 0; i < list.size(); i++) {

			if(i == len) break;
			if (list.get(i) == list.get(len--)) {
				continue;
			} else {
				return false;
			}
		}

		return true;
	}

	private int input() {

		Scanner in = new Scanner(System.in);
		return in.nextInt();
	}
}


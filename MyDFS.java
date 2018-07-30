package dfs;

import java.util.Scanner;

public class MyDFS {

    public static int n, k;
    public static int[] a;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();

        a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(calldfs());
    }

    private static String calldfs() {

        if (dfsrec(0, 0) == false) {
            return "No";
        } else {
            return "YES";
        }

    }

    private static boolean dfsrec(int i, int sum) {

        if (n == i) {
            return sum == k;
        }

        if (dfsrec(i + 1, sum)) {
            return true;
        }

        if (dfsrec(i + 1, sum + a[i])) {
            return true;
        }

        return false;
    }
}

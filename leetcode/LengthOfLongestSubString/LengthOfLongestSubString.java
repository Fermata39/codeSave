package leetcode;

import java.util.HashSet;

public class lengthOfLongestSubstring {
    public static void main(String[] args) {
        System.out.println(CalllengthOfLongestSubstring("abcabcbb"));
    }

    private static int CalllengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int ans[] = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
            } else {
                ans[i] = set.size();
                set.clear();
                set.add(s.charAt(i));
            }
        }
        int max = set.size();

        for (int i = 0; i < ans.length; i++) {
            if (ans[i] < max) {
                continue;
            } else {
                max = ans[i];
            }
        }

        return max;
    }
}


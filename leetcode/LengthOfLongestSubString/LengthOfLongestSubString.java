package leetcode;

import java.util.HashSet;

public class lengthOfLongestSubstring {
    public static void main(String[] args) {
        System.out.println(CalllengthOfLongestSubstring("abcabcbb"));
    }

    private static int CalllengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();

        int max = 0;

        if (s.length() == 1) {
            return 1;
        }

        for (int i = 0; i < s.length(); i++) {

            set.add(s.charAt(i));

            for (int j = i+1; j < s.length(); j++) {
                if (!set.contains(s.charAt(j))) {
                    set.add(s.charAt(j));
                    max = Math.max(max, set.size());
                } else {
                    max = Math.max(max, set.size());
                    set.clear();
                    break;
                }
            }
        }
        return max;

    }
}


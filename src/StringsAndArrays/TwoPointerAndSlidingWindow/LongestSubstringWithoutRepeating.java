package StringsAndArrays.TwoPointerAndSlidingWindow;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/
import java.util.*;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s)); // Output: 3
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();
        int i = 0, maxLength = 0;
        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            while (window.contains(c)) {
                window.remove(s.charAt(i));
                i++;
            }
            window.add(c);
            maxLength = Math.max(maxLength, j - i + 1);
        }
        return maxLength;
    }
}

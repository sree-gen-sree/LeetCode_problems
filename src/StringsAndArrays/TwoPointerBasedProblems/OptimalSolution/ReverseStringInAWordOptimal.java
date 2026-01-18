package StringsAndArrays.TwoPointerBasedProblems.OptimalSolution;

//https://leetcode.com/problems/reverse-words-in-a-string-iii/
public class ReverseStringInAWordOptimal {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String result = reverseStringInAWord(s);
        System.out.println(result);
    }
    private static String reverseStringInAWord(String s) {
        char[] ch = s.toCharArray();
        int n = ch.length;
        System.out.println(n);
        int start = 0; // start index of a word
        for (int end = 0; end <= n; end++) {
            // When we hit a space or the end of the string, reverse the word
            if (end == n || ch[end] == ' ') {
                reverse(ch, start, end - 1);
                start = end + 1; // move start to next word
            }
        }
        return new String(ch);
    }
    private static void reverse(char[] ch, int left, int right) {
        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
    }
}

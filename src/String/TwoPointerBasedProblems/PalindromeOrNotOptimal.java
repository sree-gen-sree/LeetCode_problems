package String.TwoPointerBasedProblems;

//https://leetcode.com/problems/valid-palindrome/
public class PalindromeOrNotOptimal {
    public static void main(String[] args) {
        String name = "MALAA+A*M";
        boolean palindrome = isPalindrome(name.toLowerCase());
        System.out.println(palindrome);
    }
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

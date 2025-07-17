package String.TwoPointerBasedProblems;

public class IsPalindromeOrNotWithSpecialCharacters {
    public static void main(String[] args) {
        String name = "(^J^ALAALAM^(";
        boolean palindrome = isPalindrome(name);
        System.out.println(palindrome);
    }
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

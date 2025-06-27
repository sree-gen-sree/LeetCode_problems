package TwoPointerBasedProblems;

public class ValidPalindrome2 {
    public static void main(String[] args) {
        String s = "abdefehdba";
        System.out.println(validPalindrome(s)); // Output: true
    }
    public static boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                // Try skipping left or right character
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }
    // Helper function to check if s[left...right] is a palindrome
    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}

package TwoPointerBasedProblems;

public class CreateValidPalindrome {
    public static void main(String[] args) {
        String s = "abdefeuhdba";
        System.out.println(validPalindrome(s)); // Output: abdefedba
    }
    public static String validPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {  //abdefeuhdba
            if (s.charAt(left) != s.charAt(right)) {
                // Modified block
                if (isPalindrome(s, left + 1, right))
                    return s.substring(0, left) + s.substring(left + 1);
                else if (isPalindrome(s, left, right - 1))
                    return s.substring(0, right) + s.substring(right + 1);
                else
                    return "Not possible";
            }
            left++;
            right--;
        }
        return s; // Already a palindrome
    }
    // Helper function to check if s[left...right] is a palindrome
    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) { //abdefeuhdba
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}

package String.TwoPointerAndSlidingWindow;

public class PermutationInString {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2)); // Output: true
    }
    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()){
            return false;
        }
        int[] s1Freq = new int[26];
        int[] windowFreq = new int[26];
        // Count frequency of each character in s1
        for (char ch : s1.toCharArray()) {
            s1Freq[ch - 'a']++;
        }
        int windowSize = s1.length();
        for (int i = 0; i < s2.length(); i++) {
            // Add current character to the window frequency
            windowFreq[s2.charAt(i) - 'a']++;
            // Remove character left out of the window
            if (i >= windowSize) {
                windowFreq[s2.charAt(i - windowSize) - 'a']--;
            }
            // Compare arrays only when the window is full
            if (i >= windowSize - 1) {
                if (matches(s1Freq, windowFreq)) {
                    return true;
                }
            }
        }
        return false;
    }
    // Helper method to compare two frequency arrays
    private static boolean matches(int[] s1Freq, int[] windowFreq) {
        for (int i = 0; i < 26; i++) {
            if (s1Freq[i] != windowFreq[i])
                return false;
        }
        return true;
    }
}

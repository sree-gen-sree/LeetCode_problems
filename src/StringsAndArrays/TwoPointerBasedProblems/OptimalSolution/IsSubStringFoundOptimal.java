package StringsAndArrays.TwoPointerBasedProblems.OptimalSolution;

//https://leetcode.com/problems/is-subsequence/
public class IsSubStringFoundOptimal {
    public static void main(String[] args) {
        String t = "abcxxxxx";
        String s = "abx";
        System.out.println(IsStringFoundInMainString(s, t));
    }

    public static boolean IsStringFoundInMainString(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }

}

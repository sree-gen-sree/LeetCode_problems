package StringsAndArrays.TwoPointerBasedProblems.OptimalSolution;

//https://leetcode.com/problems/reverse-string/
public class ReverseStringOptimal {
    public static void main(String[] args) {
        char[] name = "-abc+dhjf=kh*".toCharArray();
        System.out.println(ReverseLogic(name));
    }
    public static char[] ReverseLogic(char[] s) {
        int l = 0;
        int r = s.length - 1;
        while (l < r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
        return s;
    }
}

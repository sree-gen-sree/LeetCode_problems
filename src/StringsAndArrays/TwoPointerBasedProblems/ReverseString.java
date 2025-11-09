package StringsAndArrays.TwoPointerBasedProblems;

public class ReverseString {
    public static void main(String[] args) {
        String s = "hello";
        String result = reverseString(s);
        System.out.println(result);
    }

    private static String reverseString(String s) {
        StringBuilder reversedString = new StringBuilder();
        for(int i = s.length()-1; i>=0; i--){
            reversedString.append(s.charAt(i));
        }
        return reversedString.toString();
    }
}

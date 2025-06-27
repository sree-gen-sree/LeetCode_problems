package TwoPointerBasedProblems;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        String input = "a-bC-dEf-ghIj*";
        String output = reverseOnlyLetters(input);
        System.out.println("Output: " + output);  // Output: j-Ih-gfE-dCba
    }
    public static String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (!Character.isLetter(arr[left])) {
                left++;
                continue;
            }
            if (!Character.isLetter(arr[right])) {
                right--;
                continue;
            }
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
}

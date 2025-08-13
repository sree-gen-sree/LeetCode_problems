package String.TwoPointerBasedProblems;

//https://leetcode.com/problems/squares-of-a-sorted-array/
import java.util.Arrays;

public class SortOfSquaresOptimalSolution {
    public static void main(String[] args) {
        int[] arr = {-8, -1, 0, 3, 5};
        int[] sortedArray = FindSquares(arr);
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] FindSquares(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int pos = arr.length-1;
        int[] result = new int[arr.length];
        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                result[pos] = arr[left] * arr[left];
                left++;
            }
            else {
                result[pos] = arr[right] * arr[right];
                right--;
            }
            pos--;
        }
        return result;
    }
}

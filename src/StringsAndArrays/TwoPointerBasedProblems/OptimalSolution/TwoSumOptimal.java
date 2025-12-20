package StringsAndArrays.TwoPointerBasedProblems.OptimalSolution;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
import java.util.Arrays;
public class TwoSumOptimal {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1}; // 1-based index
            } else if (sum < target) {
                left++; // Need bigger sum
            } else {
                right--; // Need smaller sum
            }
        }
        return new int[]{-1, -1}; // No solution
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11, 15}; // Must be sorted
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}

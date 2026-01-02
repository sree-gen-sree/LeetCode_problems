package StringsAndArrays.TwoPointerBasedProblems.OptimalSolution;

//https://leetcode.com/problems/sort-colors/description/

import java.util.Arrays;

public class SortColours {
    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 1, 1, 2, 2, 1};
        sortColours(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sortColours(int[] nums) {
        int low = 0; //pointer for 0's
        int mid = 0; //Pointer for unknown elements
        int high = nums.length - 1; //pointer for 2's
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            }
            else if (nums[mid] == 1) {
                mid++;
            }
            else { // nums[mid] == 2
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

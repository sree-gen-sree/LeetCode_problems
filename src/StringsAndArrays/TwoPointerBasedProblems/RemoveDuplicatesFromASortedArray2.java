package StringsAndArrays.TwoPointerBasedProblems;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/

public class RemoveDuplicatesFromASortedArray2 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,3,4};
        int result = removeDuplicatesFromSortedArray(arr);
        System.out.println(result);
    }
    public static int removeDuplicatesFromSortedArray(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int i = 1;
        int count = 1; // count occurrences of the current number
        while (i < nums.length) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count > 2) {
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums = java.util.Arrays.copyOf(nums, nums.length - 1);
            } else {
                i++;
            }
        }
        return nums.length;
    }
}

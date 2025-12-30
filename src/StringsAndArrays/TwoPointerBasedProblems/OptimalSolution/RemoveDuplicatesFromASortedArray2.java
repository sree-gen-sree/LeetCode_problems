package StringsAndArrays.TwoPointerBasedProblems.OptimalSolution;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/

public class RemoveDuplicatesFromASortedArray2 {

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,2,2,2,3,4};
        int result = removeDuplicates(arr);
        System.out.println(result);
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 3) {
            return nums.length;
        }
        int k = 3;
        for (int i = 3; i < nums.length; i++) {
            if (nums[i] != nums[k - 3]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}


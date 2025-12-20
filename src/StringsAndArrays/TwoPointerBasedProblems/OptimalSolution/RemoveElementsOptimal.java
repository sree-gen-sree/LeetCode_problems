package StringsAndArrays.TwoPointerBasedProblems.OptimalSolution;

//https://leetcode.com/problems/remove-element/
public class RemoveElementsOptimal {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 5, 6};
        int val = 2;
        int k = removeElement(nums, val);
        System.out.println(k);
    }

    private static int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            if (nums[i] == val) {
                nums[i] = nums[j];
                j--;  // reduce size
            } else {
                i++;  // move forward
            }
        }
        return j + 1; // new length which is the last valid index
    }

}

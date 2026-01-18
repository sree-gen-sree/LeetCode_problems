package StringsAndArrays.TwoPointerBasedProblems;

import java.beans.PropertyEditorManager;
import java.util.Arrays;

class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,2,2,2,3,3,4};
        int[] result = removeDuplicates(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] removeDuplicates(int[] nums) {
        if (nums.length <= 2)
            return new int[]{nums.length}; // base case
        int i = 2; // start writing from index 2
        for (int j = 2; j < nums.length; j++) {
            if (nums[j] != nums[i - 2]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return new int[]{i}; //FInal Array
    }
}

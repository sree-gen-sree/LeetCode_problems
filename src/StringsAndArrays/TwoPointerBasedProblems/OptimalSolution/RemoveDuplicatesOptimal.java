package StringsAndArrays.TwoPointerBasedProblems.OptimalSolution;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
import java.util.Arrays;

public class RemoveDuplicatesOptimal {
    public static int removeDuplicatesFromAnArray(int[] nums){
        if(nums.length == 0) return 0;
        int i = 0; //slow pointer
        for (int j = 1; j < nums.length; j++) { //fast pointer
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int k = (removeDuplicatesFromAnArray(arr));
        if(k<arr.length) {
            for (int l = k; l < arr.length; l++) {
                arr[l] = -1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

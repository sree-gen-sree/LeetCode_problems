package String.TwoPointerBasedProblems;

import java.util.Arrays;

public class RemoveDuplicates {
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
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int k = (removeDuplicatesFromAnArray(arr));
        if(k<arr.length) {
            for (int l = k; l < arr.length; l++) {
                arr[l] = -1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

package String.TwoPointerBasedProblems;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] nums = {5, 0, 3, 2, 1, 9 , 0 , 7};
        int[] result = moveZerosToEnd(nums);
        System.out.println(Arrays.toString(result));
    }

    private static int[] moveZerosToEnd(int[] nums) {
        int index = 0;
        int left = 0;
        int[] result = new int[nums.length];
        while(left < nums.length){
            if(nums[left] != 0){
                result[index] = nums[left];
                index++;
            }
            left++;
        }
        return result;
    }
}

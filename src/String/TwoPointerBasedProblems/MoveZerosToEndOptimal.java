package String.TwoPointerBasedProblems;

//https://leetcode.com/problems/move-zeroes/
import java.util.Arrays;

public class MoveZerosToEndOptimal {
    public static void main(String[] args) {
//        int[] nums = {5, 0, 3, 2, 1, 9 , 0 , 7};
        int[] nums = {0,1,0,3,12};
        moveZeros(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void moveZeros(int[] nums) {
        int left = 0;
        for (int right = 0; right < nums.length; right++){
            if(nums[right] != 0){
                nums[left] = nums[right];
                left++;
            }
        }
        while (left < nums.length){
            nums[left] = 0;
            left++;
        }
    }
}

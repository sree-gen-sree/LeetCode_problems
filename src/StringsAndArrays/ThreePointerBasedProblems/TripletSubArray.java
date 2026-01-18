package StringsAndArrays.ThreePointerBasedProblems;

//Modified problem of TripletSubSequence

public class TripletSubArray {
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 4, 7, 6};
        System.out.println(isTripletConsecutive(nums));
    }

    public static boolean isTripletConsecutive(int[] nums) {
        if (nums.length < 3)
            return false;
        for (int i = 0; i <= nums.length - 3; i++) {
            if (nums[i] < nums[i + 1] && nums[i + 1] < nums[i + 2]) {
                return true;
            }
        }
        return false;
    }
}

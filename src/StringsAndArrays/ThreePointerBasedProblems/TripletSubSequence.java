package StringsAndArrays.ThreePointerBasedProblems;

//https://leetcode.com/problems/increasing-triplet-subsequence/
//subsequence = the indices need not be consecutive
public class TripletSubSequence {
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 4, 7, 6};
        boolean result = isTripletValid(nums);
        System.out.println(result);
    }
    public static boolean isTripletValid(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num;          // smallest so far
            } else if (num <= second) {
                second = num;         // second smallest
            } else {
                // num > first AND num > second
                return true;          // triplet found
            }
        }
        return false;
    }
}

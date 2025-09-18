package String.TwoPointerBasedProblems;

//https://leetcode.com/problems/3sum-closest/
import java.util.Arrays;

public class ThreeSumClosestOptimal {
    public static void main(String[] args) {
        int[] arr = {-1, 2, 1, -4};
        int target = 2;
        int result = threeSumClosest(arr, target);
        System.out.println("Closest sum to " + target + " = " + result);
    }
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2]; // initialize with first triplet
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                // If this sum is closer to target, update closestSum
                if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                    closestSum = sum;
                }
                // If exact match, return immediately
                if (sum == target) {
                    return sum;
                } else if (sum < target) {
                    j++; // need bigger sum
                } else {
                    k--; // need smaller sum
                }
            }
        }
        return closestSum;
    }
}

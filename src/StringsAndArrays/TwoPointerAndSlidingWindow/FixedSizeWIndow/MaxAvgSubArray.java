//https://leetcode.com/problems/maximum-average-subarray-i/submissions/1831051555/

package StringsAndArrays.TwoPointerAndSlidingWindow.FixedSizeWIndow;

public class MaxAvgSubArray {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        double avg = findMaxAverage(nums, k);
        System.out.println(avg);
    }
    public static double findMaxAverage(int[] nums, int k) {
        double currSum = 0;

        if(nums.length == 0){
            return 0;
        }
        if(k>nums.length){
            return 0;
        }
        for (int i = 0; i < k; i++) {
            currSum = (currSum + nums[i]);
        }
        double currAvg = currSum / k;
        double maxAvg = currAvg;
        for (int j = k; j < nums.length; j++) {
            currSum = (currSum + nums[j] - nums[j - k]);
            currAvg = currSum/k;
            maxAvg = Math.max(currAvg, maxAvg);
        }
        return maxAvg;
    }
}

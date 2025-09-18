package String.TwoPointerBasedProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = threeSum(arr);
        System.out.println(result);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resultOfThreeSum = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i< nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if ((sum == 0)) {
                    resultOfThreeSum.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    while (j < k && nums[j] == nums[j + 1]) { // Skip duplicates for j
                        j++;
                    } //uses while loop to skip all the duplicates instead of if

                    while (j < k && nums[k] == nums[k - 1]) {// Skip duplicates for k
                        k--;
                    }
                    j++;
                    k--;
                }
                if (sum < 0) {
                    j++;
                }
                if (sum > 0) {
                    k--;
                }
            }
        }
        return resultOfThreeSum;
    }
}

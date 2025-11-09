package StringsAndArrays.TwoPointerBasedProblems;

//Best when the array is not sorted
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class TwoSumUsingHashmap {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>(); // key = value, value = index
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i}; // found the pair
            }
            map.put(nums[i], i); // store current number and its index
        }
        return new int[]{-1, -1}; // if no pair found
    }
    public static void main(String[] args) {
        int[] nums = {2, 11, 7, 12, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target))); // Output: [0, 1]
    }
}

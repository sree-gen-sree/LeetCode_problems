package String.TwoPointerBasedProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum2 {
    public static List<int[]> twoSum(int[] numbers, int target) {
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i <= numbers.length; i++) {
            for (int j = i + 1; j <numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    result.add(new int[]{i, j});
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 6, 7, 8, 9};
        int target = 12;
        List<int[]> pairs = twoSum(arr, target);
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }
    }
}

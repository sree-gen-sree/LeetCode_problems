package StringsAndArrays.TwoPointerBasedProblems;

import java.util.Arrays;

public class TwoSum1 {
    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j <numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 6, 7, 8, 9};
        int target = 12;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}


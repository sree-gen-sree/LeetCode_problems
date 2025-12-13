package StringsAndArrays.TwoPointerAndSlidingWindow.FixedSizeWIndow;

public class MaximumSumSubArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 3, 5};
        int k = 2;
        int maxSum = findMaxAverageSubArray(arr, k);
        System.out.println(maxSum);
    }

    private static int findMaxAverageSubArray(int[] arr, int k) {
        int windowSum = 0;
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum+= arr[i];
        }
        maxSum = windowSum;

        for (int end = k; end < arr.length; end++) {
            windowSum+= arr[end] - arr[end-k];
            maxSum = Math.max(windowSum, maxSum);
        }
        return maxSum;
    }
}

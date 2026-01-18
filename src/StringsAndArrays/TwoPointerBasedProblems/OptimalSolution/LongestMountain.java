package StringsAndArrays.TwoPointerBasedProblems.OptimalSolution;

public class LongestMountain {
    public static void main(String[] args) {
        int[] arr = {2,1,4,7,3,2,5};
        int result = longestMountain(arr);
        System.out.println("LOngest mountain is: " + result);
    }
    public static int longestMountain(int[] arr) {
        int n = arr.length;
        if (n < 3) return 0;
        int longest = 0;
        int i = 1;
        while (i < n - 1) {
            if (arr[i-1] < arr[i] && arr[i] > arr[i+1]) {
                int left = i - 1;
                while (left > 0 && arr[left-1] < arr[left]) {
                    left--;
                }
                int right = i + 1;
                while (right < n - 1 && arr[right] > arr[right+1]) {
                    right++;
                }
                longest = Math.max(longest, right - left + 1);
                i = right; //this we are checking becoz right - 1 can be the start of next mountain
            } else {
                i++;
            }
        }
        return longest;
    }
}


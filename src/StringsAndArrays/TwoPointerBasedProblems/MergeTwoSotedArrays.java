package StringsAndArrays.TwoPointerBasedProblems;

//https://leetcode.com/problems/merge-sorted-array/
public class MergeTwoSotedArrays {
    public static void main(String[] args) {
        int[] nums1 = {5, 6, 7, 0, 0, 0, 0};
        int m = 3;
        int[] nums2 = {1, 2, 3, 4};
        int n = 4;
        merge(nums1, m, nums2, n);
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        // If nums2 still has elements left, copy them
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}

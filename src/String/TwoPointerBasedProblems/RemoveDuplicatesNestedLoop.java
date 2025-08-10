package String.TwoPointerBasedProblems;

public class RemoveDuplicatesNestedLoop {
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        int index = 0; // Position to place the next unique element
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 5, 5};
        int k = removeDuplicates(arr);
        for (int i = k; i < arr.length; i++) {
            arr[i] = -1;
        }
        System.out.print("After removing duplicates: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}


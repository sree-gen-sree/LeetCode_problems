package String.TwoPointerBasedProblems;

public class RemoveElements {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 5, 6};
        int val = 2;
        int k = removeElement(nums, val);
        System.out.println(k);
    }

    private static int removeElement(int[] nums, int val) {
        int newLength = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[newLength] = nums[i];
                newLength++;
            }
        }
        return newLength;
    }
}

package StringsAndArrays.TwoPointerAndSlidingWindow.FixedSizeWIndow;
import java.util.*;

public class FirstNegativeInWindow {
    public static void main(String[] args) {
        int[] nums = {12, 9, -1, -7, 8, 15, 30, -16, 28};
        int k = 3;
        System.out.println(firstNegative(nums, k));
    }
    public static List<Integer> firstNegative(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>(); // stores indices of negative numbers

        int start = 0;
        for (int end = 0; end < nums.length; end++) {
            if (nums[end] < 0) {
                q.add(end);
            }
            if (end - start + 1 == k) {
                while (!q.isEmpty() && q.peek() < start) {
                    q.poll();
                }
                if (q.isEmpty()) {
                    result.add(0);
                } else {
                    result.add(nums[q.peek()]);
                }
                start++;
            }
        }
        return result;
    }
}

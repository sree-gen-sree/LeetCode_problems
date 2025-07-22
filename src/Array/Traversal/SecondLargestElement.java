package Array.Traversal;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {33, 35, 1, 10, 34, 1};
        System.out.println(findSecLargestElement(arr));
    }
    private static int findSecLargestElement(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num < first && num > second) {
                second = num;
            }
        }
        return second;
    }


}

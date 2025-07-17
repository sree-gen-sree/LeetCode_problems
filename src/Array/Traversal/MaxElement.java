package Array.Traversal;

import java.sql.SQLOutput;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 5, 6, 9, 3};
        System.out.println(maxElement(arr));
    }
    private static int maxElement(int[] array) {
        int max = array[0];
        for (int arr : array) {
            if (arr > max) {
                max = arr;
            }
        }
        return max;
    }
}

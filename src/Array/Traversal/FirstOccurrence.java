package Array.Traversal;

public class FirstOccurrence {
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 6, 6, 1, 2, 4, 5};
        int target = 5;
        int index = findFirstOccurrence(arr, target);
        System.out.println("First occurrence of " + target + " is at index: " + index);
    }

    private static int findFirstOccurrence(int[] array, int target) {
        int index = 0;
        for (int num : array) {
            if (num == target) {
                return index;
            }
            index++;
        }
        return -1;  // Not found
    }
}

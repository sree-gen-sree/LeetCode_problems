package Array.Traversal;

public class SumOfElements {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 5, 6, 9, 3};
        System.out.println(sumOfElementsInAnArray(arr));
    }
    private static int sumOfElementsInAnArray(int[] array){
        int sum = 0;
        for (int arr: array){
            sum+=arr;
        }
        return sum;
    }
}

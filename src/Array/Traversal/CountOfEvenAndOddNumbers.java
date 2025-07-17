package Array.Traversal;

public class CountOfEvenAndOddNumbers {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 5, 6, 9, 3};
        countEvenAndOddNumbers(arr);
    }
    private static void countEvenAndOddNumbers(int[] array){
        int evenCount = 0;
        int oddCount = 0;
        for (int arr: array){
            if (arr%2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println(oddCount);
        System.out.println(evenCount);
    }
}

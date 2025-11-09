package StringsAndArrays.TwoPointerBasedProblems;

import java.util.Arrays;

public class SortOfSquares {
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        int[] sortedArray = FindSquares(arr);
        System.out.println(Arrays.toString(sortedArray));
    }
    public static int[] FindSquares(int[] arr){
        int i = 0;
        for(int ele: arr){
            arr[i] = ele * ele;
            i++;
        }
        mergeSort(arr, 0, arr.length - 1);
        return arr;
    }
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++]; //this is the alternate way of writing like this arr[k] = L[i]; k++; i++;
            } else {
                arr[k++] = R[j++];
            }
        }
        while (i < n1) {
            arr[k++] = L[i++];
        }
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }
    public static void printArray(int[] arr) {
        for (int value : arr)
            System.out.print(value + ", ");
        System.out.println();
    }
}

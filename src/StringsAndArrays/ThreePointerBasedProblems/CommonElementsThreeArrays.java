package StringsAndArrays.ThreePointerBasedProblems;

//https://leetcode.com/problems/intersection-of-three-sorted-arrays/
import java.util.*;

public class CommonElementsThreeArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 10, 20, 20, 40, 80};
        int[] arr2 = {6, 7, 20, 80, 100};
        int[] arr3 = {3, 4, 15, 20, 30, 70, 80};

        System.out.println(findCommon(arr1, arr2, arr3));
    }
    public static List<Integer> findCommon(int[] a, int[] b, int[] c) {
        if (a == null || b == null || c == null) { //null check first
            return Collections.emptyList(); //array didnt exist, memory itsef is not allocated. int[] a = null
        }
        if (a.length == 0 || b.length == 0 || c.length == 0) {
            return Collections.emptyList(); //array is there but has no elements. int[] a = new int[0]
        }
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length && k < c.length) {
            if (a[i] == b[j] && b[j] == c[k]) {
                result.add(a[i]);
                i++;
                j++;
                k++;
                while (i < a.length && a[i] == a[i - 1]) i++;
                while (j < b.length && b[j] == b[j - 1]) j++;
                while (k < c.length && c[k] == c[k - 1]) k++;
            }
            else if (a[i] < b[j]) {
                i++;
            } else if (b[j] < c[k]) {
                j++;
            } else {
                k++;
            }
        }
        return result;
    }
}


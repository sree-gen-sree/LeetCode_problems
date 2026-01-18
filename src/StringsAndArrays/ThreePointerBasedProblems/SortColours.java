package StringsAndArrays.ThreePointerBasedProblems;

//https://leetcode.com/problems/sort-colors/description/

import java.util.Arrays;

public class SortColours {
    public static void main(String[] args) {
        int[] numb = {1, 0, 2, 1, 1, 2, 2, 1};
        sortColours(numb);
        System.out.println(Arrays.toString(numb));
    }
    public static void sortColours(int[] numb) {
        int low = 0; //pointer for 0's
        int mid = 0; //Pointer for unknown elements
        int high = numb.length - 1; //pointer for 2's
        while (mid <= high) {
            if (numb[mid] == 0) {
                swap(numb, low, mid);
                low++;
                mid++;
            }
            else if (numb[mid] == 1) {
                mid++;
            }
            else { // numbs[mid] == 2
                swap(numb, mid, high);
                high--;
            }
        }
    }

    private static void swap(int[] numb, int i, int j) {
        int temp = numb[i];
        numb[i] = numb[j];
        numb[j] = temp;
    }
}

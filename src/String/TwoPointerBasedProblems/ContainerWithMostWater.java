package String.TwoPointerBasedProblems;

import static java.lang.Math.min;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int area = findArea(arr);
        System.out.println("the max area of water the container can contain is: "+area);
    }

    private static int findArea(int[] arr) {
        int area = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                int newArea = min(arr[i], arr[j]) * (j-i);
                if(newArea > area){
                    area = newArea;
                }
            }
        }
        return area;
    }
}

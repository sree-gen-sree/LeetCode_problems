package StringsAndArrays.TwoPointerBasedProblems.OptimalSolution;

//https://leetcode.com/problems/container-with-most-water/
public class ContainerWithMostWaterOptimal {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int area = findArea(arr);
        System.out.println(area);
    }
    private static int findArea(int[] arr) {
        int l = 0;
        int r = arr.length-1;
        int maxArea = 0;
        while (l < r){
            int currArea = Math.min(arr[l], arr[r]) * (r-l);
            maxArea = Math.max(currArea,maxArea);
            if(arr[l]< arr[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxArea;
    }
}

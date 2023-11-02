//Search in 2D array

import java.util.Arrays;

public class Question_6 {

    public static int[] search(int[][] arr, int target){
        for(int r=0; r< arr.length; r++){
            for(int c=0; c<arr[r].length; c++){
                if(arr[r][c] == target)
                    return new int[] {r,c};
            }
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        int[][] arr = {
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        int target = 99;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
}

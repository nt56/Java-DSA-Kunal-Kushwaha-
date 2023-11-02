//Q - Max Element in 2D array

import java.util.Arrays;

public class Question_7 {

    public static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int r=0; r< arr.length; r++){
            for(int c=0; c<arr[r].length; c++){
                if(arr[r][c] > max)
                    max = arr[r][c];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        int target = 99;
        int ans = max(arr);
        System.out.println(ans);
    }
}


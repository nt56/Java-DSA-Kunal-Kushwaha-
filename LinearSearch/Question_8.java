//Q - Min Element in 2D array

import java.util.Arrays;

public class Question_8 {

    public static int min(int[][] arr){
        int min = Integer.MAX_VALUE;
        for(int r=0; r< arr.length; r++){
            for(int c=0; c<arr[r].length; c++){
                if(arr[r][c] < min)
                    min = arr[r][c];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        int target = 99;
        int ans = min(arr);
        System.out.println(ans);
    }
}


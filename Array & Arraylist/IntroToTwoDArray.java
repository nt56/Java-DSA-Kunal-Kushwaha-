import java.util.Arrays;
import java.util.Scanner;

public class IntroToTwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr2D = new int[3][2];

        System.out.print("Enter Array Elements : ");

        for(int i=0; i< arr2D.length; i++){
            for(int j=0; j< arr2D[i].length; j++){
                arr2D[i][j] = sc.nextInt();
            }
        }

//        for(int i=0; i< arr2D.length; i++){
//            for(int j=0; j< arr2D[i].length; j++){
//                System.out.print(arr2D[i][j] +" ");
//            }
//            System.out.println();
//        }

//        //advance method - 1
//        for(int i=0; i< arr2D.length; i++){
//            System.out.println(Arrays.toString(arr2D[i]));
//        }

        //advance method - 2(Enhanced for loop)
        for(int[] arr : arr2D){
            System.out.println(Arrays.toString(arr));
        }
    }
}

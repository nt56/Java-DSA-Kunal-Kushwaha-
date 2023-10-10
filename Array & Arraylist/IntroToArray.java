import java.util.Arrays;
import java.util.Scanner;

public class IntroToArray {
    public static void main(String[] args) {
        int[] arr; //declaration-arr is getting defined
        arr = new int[5]; //initialization-object is being created in heap memory

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array elements : ");

        //getting array input
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //printing the array using normal for loop - 1
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i] +" ");
//        }

        //printing the array using normal foreach loop - 1
//        for(int ele : arr){
//            System.out.print(ele +" ");
//        }

        //printing the array using Array class - 3
        System.out.println(Arrays.toString(arr));
    }
}

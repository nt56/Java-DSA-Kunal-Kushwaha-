//import java.util.Scanner;
//
//public class NoColFixed {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int[][] arr = new int[3][];
//
//        System.out.println("Enter Elements : ");
//
//        for(int row=0; row< arr.length; row++){
//            for(int col=0; col<arr[row].length; col++){
//                arr[row][col] = sc.nextInt();
//            }
//        }
//
//        for(int row=0; row< arr.length; row++){
//            for(int col=0; col<arr[row].length; col++){
//                System.out.print(arr[row][col]);
//            }
//            System.out.println();
//        }
//    }
//}
//above code shows error

import java.util.Scanner;

public class NoColFixed {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6},
                {7, 8, 9}
        };

        System.out.println("Enter Elements : ");

        for(int row=0; row< arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                System.out.print(arr[row][col] +" ");
            }
            System.out.println();
        }
    }
}

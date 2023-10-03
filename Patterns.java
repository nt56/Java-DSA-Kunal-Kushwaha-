//public class Patterns {
//
//    public static void main(String[] args) {
//
//        //this for loop for number of lines to print
//        for(int row=1; row <= 5; row++){
//
//            //this for loop for printing what and number columns or for every row run the column
//            for(int col=1; col <= row; col++){
//
//                System.out.print("*" + " ");
//
//            }
//
//            //this statement for printing new line after 1 row
//            System.out.println();
//        }
//
//    }
//
//}
//output
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *


//public class Patterns {
//
//    public static void main(String[] args) {
//
//        //there are five rows
//        for(int row=1; row <= 5; row++){
//
//            //every col is running for five times
//            for(int col=1; col <= 5; col++){
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//
//    }
//
//}
//output
//        *****
//        *****
//        *****
//        *****
//        *****


//public class Patterns {
//
//    public static void main(String[] args) {
//
//        for(int row=1; row <= 5; row++){
//
//            for(int col=5; col >= row; col--){
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//
//    }
//
//}
//output
//        *****
//        ****
//        ***
//        **
//        *


//public class Patterns {
//
//    public static void main(String[] args) {
//
//        for(int row=1; row <= 5; row++){
//
//            for(int col=1; col <= row; col++){
//                System.out.print(col + " ");
//            }
//
//            System.out.println();
//        }
//
//    }
//
//}
//output
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5


//public class Patterns {
//
//    public static void main(String[] args) {
//        pattern(4);
//    }
//
//    static void pattern(int n){
//        for(int row = 0; row < 2 * n; row++){
//
//            int totalColsInRow = row > n ? 2 * n - row : row;
//
//            //if row is greater than 4, then it starts printing decreasing stars, and normally it prints starts till 4
//            for(int col = 0; col < totalColsInRow; col++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//    }
//
//}
//output
//         *
//         *  *
//         *  *  *
//         *  *  *  *
//         *  *  *
//         *  *
//         *


//public class Patterns {
//
//    public static void main(String[] args) {
//        pattern(5);
//    }
//
//    static void pattern(int n) {
//        for (int row = 0; row < 2 * n; row++) {
//
//            int totalColsInRow = row > n ? 2 * n - row : row;
//
//            int noOfSpaces = n - totalColsInRow;
//
//            for (int s = 0; s < noOfSpaces; s++) {
//                System.out.print(" ");
//            }
//
//            //if row is greater than 4, then it starts printing decreasing stars, and normally it prints starts till 4
//            for (int col = 0; col < totalColsInRow; col++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//    }
//}


//public class Patterns {
//
//    public static void main(String[] args) {
//        pattern(5);
//    }
//
//    static void pattern(int n) {
//        for (int row = 0; row <= n; row++) {
//
//            //for spaces
//            for(int space=0; space < n-row; space++){
//                System.out.print("  ");
//            }
//
//            //for 432
//            for(int col=row; col >=1; col--){
//                System.out.print(col +" ");
//            }
//
//            //for 234
//            for(int col=2; col <= row; col++){
//                System.out.print(col +" ");
//            }
//
//            System.out.println();
//        }
//    }
//}


//public class Patterns {
//
//    public static void main(String[] args) {
//        pattern(5);
//    }
//
//    static void pattern(int n) {
//        n = 2 * n;
//        for (int row = 0; row <= n; row++) {
//
//            for(int col = 0; col <= n; col++){
//                int atEveryIndex = Math.min(Math.min(row,col),Math.min(n-row,n-col));
//                System.out.print(atEveryIndex +" ");
//            }
//
//            System.out.println();
//        }
//    }
//}


public class Patterns {

    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        int originalN = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {

            for(int col = 0; col <= n; col++){
                int atEveryIndex = originalN - Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex +" ");
            }

            System.out.println();
        }
    }
}

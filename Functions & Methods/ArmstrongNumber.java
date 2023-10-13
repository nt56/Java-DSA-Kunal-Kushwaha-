import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Number : ");
//        int n = sc.nextInt();
//        boolean ans = isArmstrong(n);
//        System.out.println(ans);

        //hree digit armstrong numbers in particular range
        for(int i=100; i<1000; i++){
            if (isArmstrong(i)){
                System.out.print(i +" ");
            }
        }
    }

    //for three digit armstrong numbers
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;

        while(n > 0){
            int rem = n % 10;
            sum = sum + rem*rem*rem;
            n = n /10;
        }

        return sum == original;
    }

}

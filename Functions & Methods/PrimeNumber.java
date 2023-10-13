import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
    }

    static boolean isPrime(int n){

        if(n <= 1){
            return false;
        }

        int c = 2;
        while(c * c <= n){
            if (c % n == 0){
                return false;
            }
            c++;
        }

        return c * c > n;
    }

}

import java.util.Scanner;

public class GreatestOfThreeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1 : ");
        int a = sc.nextInt();
        System.out.print("Enter num2 : ");
        int b = sc.nextInt();
        System.out.print("Enter num3 : ");
        int c = sc.nextInt();

        int max = a;

        if(b > max){
            max = b;
        }

        if(c > max){
            max = c;
        }

        System.out.println(max);

    }

}

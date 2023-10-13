import java.util.Scanner;

public class functionDemo {

    public static void main(String[] args) {

        sum();

        int ans = sum2();
        System.out.println("sum is : "+ans);

        int ans1 = sum3(20,30);
        System.out.println("sum is : "+ans1);
    }

    //returns value
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num-1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter num-2 : ");
        int n2 = sc.nextInt();
        int sum = n1 + n2;
        return sum;
    }

    //passing the parameter
    //returns value
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }

    //returns nothing
    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num-1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter num-2 : ");
        int n2 = sc.nextInt();
        int sum = n1 + n2;
        System.out.println("sum is : "+sum);
    }
}

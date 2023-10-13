import java.util.Scanner;

public class Swapping {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num-1 : ");
        int a = sc.nextInt();
        System.out.print("Enter num-2 : ");
        int b = sc.nextInt();
        System.out.println("Before Swapping : " +"a :" +a+ " b : " +b);

        swap(a,b);
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Before Swapping : " +"a :" +a+ " b : " +b);
    }
}

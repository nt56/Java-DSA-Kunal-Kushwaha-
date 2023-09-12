import java.util.Scanner;

public class FindLowerAndUpperCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Character : ");
        char ch = sc.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lower case");
        } else {
            System.out.println("Upper case");
        }

    }

}

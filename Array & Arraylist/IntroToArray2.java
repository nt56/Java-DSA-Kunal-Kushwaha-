import java.util.Arrays;
import java.util.Scanner;

public class IntroToArray2 {
    public static void main(String[] args) {
        //example of an array of objects
        Scanner sc = new Scanner(System.in);

        String[] str = new String[5];

        System.out.print("Enter String Elements : ");

        for(int i=0; i< str.length; i++){
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));
    }
}

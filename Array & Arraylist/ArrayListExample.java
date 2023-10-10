import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements : ");

        for(int i=0; i<4; i++){
            a.add(sc.nextInt());
        }

        System.out.println(a +" ");
    }
}

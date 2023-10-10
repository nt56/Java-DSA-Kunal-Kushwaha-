import java.util.ArrayList;
import java.util.Scanner;

public class MultiDArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Elements : ");

        //declaration
        ArrayList<ArrayList<Integer>> multiList = new ArrayList<>();

        //initialization of arraylist
        for(int i=0; i<3; i++){
            multiList.add(new ArrayList<>());
        }

        //add elements
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                multiList.get(i).add(sc.nextInt());
            }
        }

        System.out.println(multiList);
    }
}

import java.util.ArrayList;
import java.util.Scanner;

class Options{
    void display(){
        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. Display");
        System.out.println("4. Exit");
    }
}

public class ArrayListDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Options op = new Options();

        ArrayList<Integer> arr = new ArrayList<>();

        while(true){
            op.display();

            System.out.print("Enter Your Choice : ");
            int ch = sc.nextInt();

            if(ch == 1){
                System.out.print("Enter Elements : ");
                for(int i=0; i<5; i++){
                    arr.add(sc.nextInt());
                }
                System.out.println("Element added Successfully : ");
            }

            if(ch == 2){
                System.out.print("Enter Element to Remove : ");
                int r = sc.nextInt();
                if(arr.contains(r)){
                    arr.remove(Integer.valueOf(r));
                    System.out.println("Element remove Successfully : ");
                } else {
                    System.out.println("Element not found ");
                }
            }

            if(ch == 3){
                System.out.println(arr);
            }

            if(ch == 4){
                System.out.println("Finished");
                break;
            }
        }
    }
}

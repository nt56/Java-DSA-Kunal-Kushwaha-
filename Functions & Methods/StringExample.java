import java.util.Scanner;

public class StringExample {

    public static void main(String[] args) {

//        String msg = greet();
//        System.out.println(msg);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name : ");
        String name = sc.next();

        String msg2 = greet2(name);
        System.out.println(msg2);
    }

    //without parameters
//    static String greet(){
//        return "Hello Nagbhushan Tirth";
//    }

    //with parameters
    static String greet2(String name){
        return "Hello " + name;
    }

}

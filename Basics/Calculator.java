import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ans = 0;

        //run while for infinite loop
        while(true){

            System.out.print("Enter Operator : ");
            char op = sc.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){

                System.out.print("Enter Num-1 : ");
                int num1 = sc.nextInt();
                System.out.print("Enter Num-2 : ");
                int num2 = sc.nextInt();

                if(op == '+'){
                    ans = num1 + num2;
                }

                if(op == '-'){
                    ans = num1 - num2;
                }

                if(op == '*'){
                    ans = num1 * num2;
                }

                if(op == '/'){
                    if(num2 != 0){
                        ans = num1 / num2;
                    }
                }

                if(op == '%'){
                    ans = num1 % num2;
                }

            } else if (op == 'x' || op == 'X') {
                break;
            }  else {
                System.out.println("Wrong Operator");
            }

            System.out.println(ans);
        }

    }

}
//WAP to create calculator...Run until user inputs x or X
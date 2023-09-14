import java.util.Scanner;

public class SwitchDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter Fruit : ");
//        String fruit = sc.next();

        //old method
//        switch (fruit){
//            case "mango":
//                System.out.println("King of fruits");
//                break;
//
//            case "Grape":
//                System.out.println("Small Fruit");
//                break;
//
//            case "apple":
//                System.out.println("Sweet food");
//                break;
//
//            case "orange":
//                System.out.println("Round food");
//                break;
//
//            default:
//                System.out.println("Wrong input");
//        }

        //advance method
//        switch (fruit) {
//            case "mango" -> System.out.println("King of fruits");
//            case "Grape" -> System.out.println("Small Fruit");
//            case "apple" -> System.out.println("Sweet food");
//            case "orange" -> System.out.println("Round food");
//            default -> System.out.println("Wrong input");
//        }


        //Nested switch case
        System.out.print("Enter Employee ID : ");
        int id = sc.nextInt();
        System.out.print("Enter Department : ");
        String dept = sc.next();

      //old
       switch (id){
           case 1:
               System.out.println("Nagbhushan");
               break;

           case 2:
               System.out.print("Prathamesh");
               break;

           case 3:
               System.out.println("EMP ID : 3");
               switch (dept){
                   case "IT":
                       System.out.println("IT Department");
                       break;

                   case "CSE":
                       System.out.println("Computer Department");
                       break;

                   default:
                       System.out.println("No Department");
               }
               break;

           default:
               System.out.println("No EMPID");
       }

        //advance      
        switch (id) {
            case 1 -> System.out.println("Nagbhushan");
            case 2 -> System.out.print("Prathamesh");
            case 3 -> {
                System.out.println("EMP ID : 3");
                switch (dept) {
                    case "IT" -> System.out.println("IT Department");
                    case "CSE" -> System.out.println("Computer Department");
                    default -> System.out.println("No Department");
                }
            }
            default -> System.out.println("No EMPID");
        }


    }

}

import java.util.Scanner;

public class NestedSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();

        int empID = input.nextInt();
        String department = input.next();

//        switch (empID){
//            case 1:
//                System.out.println("Ambuj Kumar");
//                break;
//            case 2:
//                System.out.println("Ankit");
//                break;
//            case 3:
//                System.out.println("Employee no 3");
//                switch (department){
//                    case "IT":
//                        System.out.println("Development Department");
//                        break;
//                    case "Management":
//                        System.out.println("HR");
//                        break;
//                    default:
//                        System.out.println("No department entered");
//                }
//                break;
//            default:
//                System.out.println("Please enter correct employee Id");
//        }
// Enhanced way to write switch case code -

        switch (empID) {
            case 1 -> System.out.println("Ambuj Kumar");
            case 2 -> System.out.println("Ankit");
            case 3 -> {
                System.out.println("Employee no 3");
                switch (department) {
                    case "IT" -> System.out.println("Development Department");
                    case "Management" -> System.out.println("HR");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Please enter correct employee Id");
        }
    }
}

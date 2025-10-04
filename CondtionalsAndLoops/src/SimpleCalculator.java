import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        // Here we will be making a simple calculator
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
        int result = 0;
        while(true){
            // This will read the operator
            System.out.print("Please Enter the operator:");
            char op = in.next().trim().charAt(0);
            if(op == '+'|| op == '-'|| op == '*' || op == '/' || op == '%'){
                // Now after the operator we will give the two number for calculation
                System.out.print("Please Enter the two number: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if(op == '+'){
                    result = num1 + num2;
                }if(op == '-'){
                    result = num1 - num2;
                }if(op == '*'){
                    result = num1 * num2;
                }if(op == '%'){
                    result = num1 % num2;
                }if(op == '/'){
                    if(num2 != 0 ){
                        result = num1 / num2;
                    }
                }
            }else if(op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid Operation");
            }
            System.out.println(result);

        }
    }
}

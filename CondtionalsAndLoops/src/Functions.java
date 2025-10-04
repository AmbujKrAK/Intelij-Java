import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
//            Sum(); // It will directly print the answer.
            int ans = Sum2(); // The ans will hold the return value.
        System.out.println("This is the ans of Sum2: " + ans);
        }

        static int Sum2(){
            Scanner in = new Scanner(System.in);
            System.out.print("Please enter the first number:");
            int num1 = in.nextInt();
            System.out.print("Please enter the second number:");
            int num2 = in.nextInt();
            int sum2 = num1 + num2;
           return  sum2 ; // Here we are returning the sum and after this line the function end no other line will be executed.
        }

        // Create a simple addition function without specifying the return type-

        static void Sum(){ // we does not want this function to return anything
            Scanner in = new Scanner(System.in);
            System.out.print("Please enter the first number:");
            int num1 = in.nextInt();
            System.out.print("Please enter the second number:");
            int num2 = in.nextInt();
            int sum = num1 + num2;
            System.out.println("Sum is - " + sum); // We are specifying here that the value will be int. Here we are just printing the ans.
    }
}

import java.util.Scanner;

public class Finbonacchi {
    public static void main(String[] args) {
        // Finbonachi
        // Q find the nth term
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); // This will take the input as the nth term which we need to find.
        int p = 0; // previous term
        int i = 1; // current index

        // as we need previous and the current ( p + i ) = current nth fib term

        int count = 2; //  As we have the previous 2 number;

        while(count <= n){
            int temp = i; // placing the value of i into temp variable
            i = i + p; // adding both the terms and placing the value in i
            p = temp; // giving the current value to the previous value.
            count++;
        }
        System.out.println(i);
    }
}

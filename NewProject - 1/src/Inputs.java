import java.util.Scanner;

public class Inputs {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number - ");
        int rollno = input.nextInt();
        float roll = input.nextFloat(); // Here we are taking a float value to test, if we pass 10.
        System.out.println("Your roll no is : " + rollno);

        System.out.println("Your roll no is : " + roll); //  It will give value as at 10.0 because "type conversion or casting" is happening.

        // In java the ref variables are also called "identifiers" and the value is also called as "literals".
        // int a  = 10 , so here a is an identifier and 10 is the literal.

        // suppose we want to write 1,00,000 in java we can do it by giving underscore in place of comma = 1_00_000
    }
}

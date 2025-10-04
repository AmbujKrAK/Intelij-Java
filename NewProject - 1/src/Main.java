import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("Hello World");
        // This "out" statement is a class, Printing in "out" = command line, if we give out a value of a readme file then it will pass whatever we need to print in that field. print - ln mean print  in a new line.

        //  We can also take input using -
        Scanner input = new Scanner(System.in);
        //  Here the "in" refers to a class that take the input from our keyboard. Suppose, if we change it to a file then it will take everything in that file as input.

        //  input.nextInt()  ---> this lets us input an integer now I will put it in print statement so that we can see what we are inputting.

        System.out.println(input.nextInt());

        // This line below will take String, the problem with it is it will take only the 0th index.

        System.out.println(input.next());

        // We can do nextLine to print the whole contents of the string -

        System.out.println(input.nextLine());

        // Every class in java extends the object class.

    }
}

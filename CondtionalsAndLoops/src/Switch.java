import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
        // Creating a Switch case for printing the attributes of the specific fruits
        System.out.println("Please enter a fruit: ");
        String fruit = input.next();

        switch (fruit){
            case "Mango":
                System.out.println("King of Fruits");
                break;
            case "Apple":
                System.out.println("Keeps the Doctor away");
                break;
            case "Orange":
                System.out.println("One for each");
                break;
            case "Grapes":
                System.out.println("Barries");
                break;
            default:
                System.out.println("Please enter a valid fruit");
        }

    }
}

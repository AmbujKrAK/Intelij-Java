import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
        // Creating a Switch case for printing the attributes of the specific fruits
        System.out.println("Please enter a fruit: ");
        String fruit = input.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King of Fruits");
            case "Apple" -> System.out.println("Keeps the Doctor away");
            case "Orange" -> System.out.println("One for each");
            case "Grapes" -> System.out.println("Barries");
            default -> System.out.println("Please enter a valid fruit");
        }

    }
}

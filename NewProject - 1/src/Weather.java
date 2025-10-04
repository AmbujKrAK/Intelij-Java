import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the temp in Celsius: ");

        float tempC = input.nextFloat();

        float tempF = (tempC * 9/5) + 32;
        System.out.println("Temp in Fahrenheit: "+ tempF);
    }
}

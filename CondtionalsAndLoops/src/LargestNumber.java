import java.sql.SQLOutput;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        // Q. Find the largest number out of the user input -
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = Math.max(c, Math.max(a,b));
        System.out.println(max);
    }
}

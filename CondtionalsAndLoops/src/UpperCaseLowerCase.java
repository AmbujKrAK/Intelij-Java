import java.util.Scanner;

public class UpperCaseLowerCase {
    public static void main(String[] args) {
        // check the case of the char

        Scanner in = new Scanner(System.in);

        char ch = in.next().trim().charAt(0);
//        .trim() remove all the extra spaces from the left and right of the input.
//        .charAt(0) lets us pick the specific character at the specified index.

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }else {
            System.out.println("Uppercase");
        }

//        System.out.println(in.next());
    }
}

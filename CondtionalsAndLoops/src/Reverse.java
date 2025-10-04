import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        // We need to reverse a given number
        Scanner input= new Scanner(System.in);
        int n = input.nextInt();
        int revNum = 0;
        while(n > 0){
            int rem = n % 10;
            n /= 10;
            revNum = revNum * 10 + rem;
        }
        System.out.println(revNum);
    }
}

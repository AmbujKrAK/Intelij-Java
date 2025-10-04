import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
        // We need to found in a given series how many times n occurs
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        int n = 45536;

        int count = 0;
        while(n > 0){
            int rem = n % 10;
            if(rem == 5){
                count++;
            }
               n =  n /10;
        }

        System.out.println(count);

    }
}

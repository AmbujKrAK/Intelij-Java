public class TwoDLoop {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= n; i++) {
//                System.out.print("*");
            for (int j = 1; j <= n; j++) {
//                if(i == 1 || j == n || j == 1 || i == n){
                    System.out.print(i +" ");
//                }else {
//                    System.out.print("  ");
//                }
            }
            System.out.println();
        }
    }
}

public class Conditions {
    public static void main(String[] args) {
        // Conditions -

    /*        Syntax of If-Else Statements:
        if(boolean exression T or F){
            // If condition is True
        }else{
            // Else this as the condtion is False
            }
        }
    */
        int salary = 25000;
//        if(salary > 10000){
//            salary = salary + 1000;
//        }else{
//            salary = salary + 2000;
//        }
//
//        System.out.println(salary);

        // Multiple If-Else Statements

        if(salary > 10000) {
            salary += 2000;
        } else if (salary > 20000) {
            salary += 30000;
        }else{
            salary += 1000;
        }
        System.out.println(salary);
    }
}

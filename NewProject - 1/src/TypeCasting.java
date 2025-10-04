public class TypeCasting {
    public static void main(String[] args) {
        // Type casting or conversion -  It is a process where one type of data which is assigned to variable changes into a different datatype automatically if certain conditions are met.
        // Int < Float so the type conversion will favour the float value and give an error if try to do it the other way around.

//        Example of type conversion -
        int num  = (int) (6.76f);
        System.out.println(num); // it will only take the value before decimal and not round it off.

//        Automatic type promotion in expression -
        int a = 257;
        byte b = (byte)(a);
        System.out.println(b); //  we will get "1" because, because the maximum value a byte can hold is 256, we are trying to pass 257 so it will try to it by doing 257 % 256 = 1.

//        Another example of automatic type promotion in expression -
        byte one = 40;
        byte two = 50;
        byte three = 100;
        int result = one * two / three ; // In this line the type conversion happens

        System.out.println(result); // The answer is 2000 but the byte can only store 256, this is where the type casting comes in the picture. As the result variable is a int so it changes the type of the byte variables to integer variable.

        // Java uses Unicode principal, so if we want to print a value of a character it will return its ASCII value;
        int A = 'A';
        System.out.println("This is the ASCII value of 'A': "+ A);

        // It can also print any string in any language as it
        System.out.println("हैलो वर्ल्ड");


        // This example will cover the basic rule of automatic type promotion -

        byte B = 42;
        char C = 'a';
        short S = 1024;
        int I = 50000;
        float F = 5.67f;
        double D = 0.1234;
        double Result = (F * B) + (I / C) - (D * S);
        // First expression converted into float, 2nd converted in int, 3rd converted into double as short is small. So float + int + double = double
        System.out.println((F * B) + " " + (I / C) +  " " + - (D * S));
        System.out.println(Result);
    }
}

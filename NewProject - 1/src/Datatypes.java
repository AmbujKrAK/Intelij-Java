public class Datatypes {
    public static void main(String[] args) {
        // This point to all the primitive datatypes. Basically all the datatype that cannot be broken further are know as primitive datatype, if we brake a string individually it will only create individual characters but not other datatype apart from a string. Similarly, an integer will always be an integer.
        int rollno = 02; // can store 4 bytes
        String name = "Ambuj";
        char letter = 'a';
        // Character starts with single quotes, a string starts with double quotes.
        float marks = 98.99f; // can store 4 bytes
        // We need to add "f" at the end of the float value because, as to not get an error while computing as in some cases this could create an issue. Normally all the float value are in double formate. Mainly the error is that it rounds-off all last digit.
        double largerDecimalNumbers = 123456789.12345; // can store 8 bytes
        long largeInteger = 84512485235245120L; // can store 8 bytes
        // We need to add "L" at the end of the float value because, it lets us store larger value and by giving it the keyword we can save ourselves from unexpected errors.
        boolean check = true ; // or false ;
    }
}

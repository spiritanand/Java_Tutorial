public class A12_ParsingValFromStrings {
    public static void main(String[] args) {
        // The question that may rise in your head is that what exactly is parsing. Well, parsing is to read
        // the value of one object and to convert it to another type. Here we will be looking at parsing values
        // from a String.
        // Suppose we are getting some data from a user interface in the form a string. However, we want to use
        // the value of the number that the user has entered (some important number like credit card number or
        // phone number). In this case we will parse the values of string to get the value of the number entered.

        String numStr = "2020";
        int num = Integer.parseInt(numStr); // Here we are using a class called Integer. This is a wrapper
        // class (will be covered in a future section) for the primitive data type int. It has a few useful
        // static methods such as the parseInt method. Now parseInt tries to convert the String to an integer.
        // I say try because only iff the string is all numbers will it be converted. If the string is not
        // numbers, but includes any other character then it will throw an exception (an error).
        // You can try this yourself.
        System.out.println("This is a String " + numStr);
        System.out.println("This is an int " + num);

        // Verifying whatever has been stated.

        numStr += 12;
        System.out.println("The result of this will be concatenating the two String not increasing " +
                "the value of the number. Output is " + numStr);
        num += 12;
        System.out.println("The result will be addition of 12 (years hopefully post the Corona virus) and we " +
                "get the output = " + num);
    }
}
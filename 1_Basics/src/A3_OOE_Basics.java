public class A3_OOE_Basics {
    public static void main(String args[]) {
        /*
        This section will give you an explanation of what are operators, operands and expressions.

        Operators are special symbols that perform specific operations on one or more operands. As an example
        we used the plus(+) operator in the last C2_DataTypes section to concatenate two strings or sum the
        value of two variables.

        Operand is a term used to describe any object that is manipulated by an operator. It could be anything
        a variable, a literal string, a number, etc.

        An expression is formed by combining variables, literals, method return values(which will be covered in
        a future section) and operators.
         */

        int myValue = 30 + 1;
        // Here '30+1' is the expression that is returning the value 31

        // Few of the most common operators are :-

        int myNum = 9 + 12;// Addition(+) of two numbers, 9 + 12 give Output -> 21
        System.out.println(myNum);

        int previousNum = myNum;// This is the equals to(=) operator and is used to assign value. Output -> 21
        System.out.println(previousNum);

        int myMultiplication = 9 * 30;// The asterisk(*) is used for multiplication. Output -> 270
        System.out.println(myMultiplication);

        int myDivide = 30 / 9;// The forward slash(/) is used for division. Since we are using an int we get the
        // result as an integer rather than a floating value. Output -> 3
        System.out.println(myDivide);

        int myModulo = 30 % 12;// The modulus(%) returns the remainder of (a/b). Output -> 6
        System.out.println(myModulo);

        // Abbreviating Operators

        myNum++;// This translates to myNum = myNum + 1. Output -> 22
        System.out.println(myNum);

        myNum -= 9; // This translates to myNum = myNum - 9. Output -> 13
        System.out.println(myNum);

        myNum *= 8; //  This translates to myNum = myNum * 8. Output -> 104
        System.out.println(myNum);

        myNum /= 4; //  This translates to myNum = myNum / 8. Output -> 26
        System.out.println(myNum);

        // We can abbreviate any operator this way, this increases our efficiency and productivity.
    }
}

public class A2_DataTypes {
    public static void main (String[] args)
    {
        /*
        Variables are a way to store information. Variables that we define in a program can be accessed by a
        name we give. The contents of a variable are variable. We need to tell the computer what type of info.
        we want to store and the name we want to give to it. There are a lot of different data types. Data
        types are a keyword in Java.
        */

        /*
        Lets start out by defining the variable of type int - int is the abbreviation of integer, a number
        without decimal points.
        To define a variable we need to specify the data type, then give the variable a name and optionally add
        an expression to initialize the variable with a value.
         */

        int myFirstNumber =10;
        int mySecondNumber = 20;
        int myThirdNumber = 30;
        int myTotal = myThirdNumber + mySecondNumber;
        System.out.println(myFirstNumber + myTotal);
        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);

        /*
        In total there are 8 primitive data types ; int,char,boolean,byte ,short,long,float and double.They are
        the building blocks of data manipulation.
         */

        // The range of int is not infinite that is it has some defined range. Let us see what is it's range.
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;
        // Here Integer is a wrapper class. We use it so that we can perform operations on an int.
        System.out.println("The maximum value of int is :- "+minValue);
        // Output = -2147483648
        System.out.println("The maximum value of int is :- "+maxValue);
        // Output = 2147483647

        /*
            If we try to exceed the min or the max value of the integer data type then we get the case of an
            underflow or the case of overflow respectively.

            For example :-
        */


        System.out.println("The underflow value of int in this case is :- "+(minValue -1));
        // Output = 2147483647
        System.out.println("The overflow value of int in this case is :- "+(maxValue+1));
        // Output = -2147483648

        // Note :- We cannot explicitly initialize the int value to a number larger or smaller tha its max or
        // min respectively. This would return as a error.

        // Lets take a look at the byte data type

        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        // Here Byte is a wrapper class. We use it so that we can perform operations on an byte.
        System.out.println("The maximum value of byte is :- "+minByteValue);
        // Output = -128
        System.out.println("The maximum value of byte is :- "+maxByteValue);
        // Output = 127

        // The byte data type takes up only 8 bits of storage, but has a very small range.
        
        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        // Here Short is a wrapper class. We use it so that we can perform operations on an short.
        System.out.println("The maximum value of short is :- "+minShortValue);
        // Output = -32768
        System.out.println("The maximum value of short is :- "+maxShortValue);
        // Output = 32767

        // The short data type takes up only 16 bits of storage, but has a small range.

        /*
        TBH we wont be using much of the short and byte data type as modern computers do not have such
        restrictions on memory. They are usually used to increase the performance when the range of the
        integers to be used is known and small enough.
        In contrast int uses 32 bits of data.
        So different data types take different memory space.
         */
        
        /*
        Now of course we would want to manipulate and process larger numbers than 2147483647, so for this 
        case we use the long data type. The max of the long data type is -2^63 to + 2^63 - 1.
         */
        
        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        // Here Long is a wrapper class. We use it so that we can perform operations on an long.
        System.out.println("The maximum value of long is :- "+minLongValue);
        // Output = -9223372036854775808
        System.out.println("The maximum value of long is :- "+maxLongValue);
        // Output = 9223372036854775807

        // Now to use long we need to type the letter 'L' at the end of the number. This forces Java to treat
        // the number as a long.
        long myLongNum =  2_147_483_647_123L;
        // If we do not use the L we will get an error as Java treats a number as an int by default.

        // Casting in Java
        // As you may already know if we do not specify ant thing for a number it is treated as an integer.
        // For example
        // byte myByteHalf = (minByteValue/2);
        // Error:(107, 40) java: incompatible types: possible lossy conversion from int to byte
        // This results in an error as it is expecting a byte but is receiving an int which is set by default.
        byte myByteHalf = (byte) (minByteValue/2);
        // Now we have explicitly stated the cast as byte. Now this code will run smoothly.

        /*
        Now that we have dealt with whole numbers we should now look at dealing with numbers that involve
        decimal points. Having the power to manipulate such numbers can be really beneficial in solving many
        problems. Java has two primitive data types for dealing with decimal numbers. They are namely double
        and float. Let us take a deeper look at them.
        */

        /* Float is a single precision number. Precision refers to the format and amount of space occupied by
        the type. Single precision occupies 32 bits, whereas double which is a double precision number (no pun
        intended) occupies 64 bits.
         */

        // Lets look at the range of float data type.

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println( "Float Min Value "+myMinFloatValue );
        // Output - 1.4E-45
        System.out.println("Float Max Value "+ myMaxFloatValue );
        // Output - 3.4028235E38


        // Lets look at the range of double data type.

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println( "Double Min Value "+myMinDoubleValue );
        // Output - 4.9E-324
        System.out.println("Double Max Value "+ myMaxDoubleValue );
        // Output - 1.7976931348623157E308

        // It can be clearly seen that the range of the double is much more than that of float data type,
        // but on the other hand it requires 64 bits compared to the 32 bits of float.

        // The default decimal data type is double. So if we have to use float data type we will have to cast
        // it explicitly by adding a 'f' to the end of the decimal number.
        // For example :-
        float myFloat = 5.23f;
        double myDouble = 6.969d;

        // The int does not handle numbers after the decimal point.
        int divInt = 5/2;
        System.out.println(divInt);
        // Output - 2
        double divDouble = 5d/2d;
        System.out.println(divDouble);
        // Output - 2.5

        // It is considered as good practice to mention f or d at the end of numbers to clearly state their type.

        /*
        Believe it or not the double(64 bits) gets processed faster than the float(32 bits) in most of the
        modern computers. Almost all of the Java math libraries return double as their default value. Hence, it
         is recommended to use the double data type when dealing with floating numbers.
         */

        /*
        The double data type is great for general floating operations. But it is not great where precise
        calculations are required. This is due to a limitation of how floating point numbers are stored and not
        a Java problem as such.
        To overcome this problem Java has a class named 'BigDecimal'.
         */

        // Now let us take a look at the primitive data type namely the char.

        /*
        The char and the String data type are different. We have previously seen String literals in this course
        . They are similar only in the sense that both store characters but char only literally stores one
        character. You would think that the char would take 1 byte of memory, but it actually takes 2 bytes
        (16 bits) of memory. It is due to the fact that it allows you to store Unicode characters.
        Unicode is international encoding standard for use with different languages and scripts, by which each
        letter, digit, symbol, etc. are represented by a unique numeric value that applies across different
        platforms and programs.
        To see all the different numeric values assigned see 'unicode-table.com'.
         */

        char myChar = 'S';
        System.out.println(myChar);
        // Output - S

        // To represent a char in unicode numeric value we have to use '\'+'u' before the numeric value.
        char myUniChar = '\u0053';
        System.out.println(myUniChar);
        // Output - S

        // Now let us take a look at the last primitive data type boolean.

        /*
        The boolean data type stores only two types of values, true and false. This data type is very useful in
        programming as we will see in the future.
         */

        boolean isSpiritBadass = true;
        System.out.println(isSpiritBadass);
        // Output - true

        // So here it is we have covered all the 8 primitive data types in Java.

        /*
        Now lets discuss about another important data type, String. Now the String is not a primitive data type
         rather it is a class, but it enjoys a special treatment than other classes.
        A String is can contain a sequence of characters. Technically it is limited by the memory or the
        MAX-VALUE of int which is 2.14 billion characters.
         */

        String myStr = "SpiritMonster";
        System.out.println(myStr);
        // Output - SpiritMonster
        String myStrNum1 = "4";
        String mySum = myStrNum1 + 2;
        // The output here would be different than what you would think. Here as we are adding an int to a String
        // the int gets converted to a String and hence the output is not 6 rather 42.
        System.out.println("The (\u2211) sum of the two is :- "+ mySum);
        // Output - The (∑) sum of the two is :- 42
        // In String we can use unicode characters as well, so the String data type is very versatile.
        String newStr = myStr + mySum;
        System.out.println(newStr);
        // Output - SpiritMonster42

        /*
        Strings are immutable that is you cannot change a String after its creation. So the way that we append
        to a String is in such a way that a new String is created in the appended form and the old String is
        deleted from memory. Using + to append strings is a really inefficient way to append to Strings and
        isn't recommended. Rather we will use the StringBuffer which can be changed. We will see this in a
        future section.
         */
    }
}

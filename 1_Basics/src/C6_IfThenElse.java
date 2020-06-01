public class C6_IfThenElse {
    public static void main (String args[]){
        /*
        If-then-else is a control flow statement. It is an extension of the if-else control flow statement. In
        this case the first code block is executed iff the condition is true otherwise the code block after
        else will be executed.
         */

        int marks = 757;
        if (marks > 770){
            System.out.println("Congratulations you have passed the first round.");
            System.out.println("This is the second line. It is getting executed thanks only to the code block.");
        } else{
            System.out.println("Hard Luck! Try again next time");// Outputted
            System.out.println("This is the next line. It is getting executed thanks only to the code block.");
        }

        // To execute multiple statements it is necessary to use a code block.

        // Apart from using an else we can use an else-if with it as well. In this case the specific block of
        // code will be executed whose condition is true. You need to be careful about the order of the
        // conditions as different order might result in different results.

        if (marks > 770){
            System.out.println("Congratulations you have been selected in the first round.");
            System.out.println("This code block would not be executed as my marks is less than 770, so the " +
                    "condition is not true.");
        } else if (marks >755){
            System.out.println("Congratulations you have been selected in the second round.");// Outputted
        }else{
            System.out.println("This will not be printed as my marks are greater than 755. So the previous code" +
                    " block will be executed and the machine will 'break' out of the if-else. After all the " +
                    "conditions fail then this code block will be executed.");
        }
    }

}

public class C10_WhileDoWhile {
    public static void main(String args[]) {
        // Now a for loop is very useful when we want to execute a certain command 'n' number of times, but
        // what if we do not know how many times we have to execute certain commands (till a certain condition
        // is true). Then it could be tricky for us to use a for loop as we do not have a specific value of n.
        // So in this case we use a while loop (or a do-while loop). This executes a statement as long as the
        // condition is true.

        int i = 0;
        System.out.println("Let us have a look at the while loop.");
        while (i <= 5) {
            System.out.println("while-->" + i);
            i++; // It is vital that we have this step as the variable must change (increase or decrease) for
            // the loop to break otherwise we will be stuck in an infinite loop.
        }
        System.out.println("Let us have a look at an almost identical for loop.");
        for (i = 0; i <= 5; i++) {
            System.out.println("for  -->" + i);
        }
        // Both of them have the same outputs.
        // Now the do-while loop is a bit different, the do-while loop is guaranteed to run at least once. So
        // the condition must be set with caution. Although the do-while loop also performs a similar task.
        i = 0;
        System.out.println("Let us have a look at the do-while loop.");
        do {
            System.out.println("do-while-->" + i);
            i++;
        } while (i <= 5);
        // NOTE : Observe that we have added a semi-colon at the end of the do-while loop.
        // As the condition of the do-while loop is checked at the end it is also known as exit-controlled loop.
        // Similarly the simple while loop is known as entry-controlled loop.
    }
}

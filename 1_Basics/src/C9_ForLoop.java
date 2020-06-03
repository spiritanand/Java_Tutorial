public class C9_ForLoop {
    public static void main(String args[]){
        // Suppose you want to write the code to print numbers from one to hundred or print all the compound
        // interest over a principal and a rate over the time period of 25 years.
        // Whew!!!! That is a tough job to write so much code; so many System.out.println(1);..........
        // ...........System.out.println(100);
        // This could have been a tough job if not for our wonderful and powerful computers. Yeah that's
        // right we can leave all the laborious tasks for the computer to handle. We can use a loop to solve
        // our such problems.
        // Here we will be looking at a for loop.
        // Loops are all over the place in programming and are very essential for various computational
        // tasks such as calculations or performing a certain task over a certain period of time.

        // The syntax for a for loop is:-
        // for (init;termination;increment(or decrement)){
        // CODE BODY HERE
        // }
        // Here init is the variable initialized with a value. This variable is used for running this for
        // loop.The termination is a condition that check against the variable and proceeds only if
        // true. After the termination of loop the the variable is incremented(or decremented) and the
        // variable is again checked against the termination condition and it proceeds to the loop only iff
        // true else it break out of the loop.

        // Lets have a look at the example of calculating and printing compound interest over the period of
        // 10 years with a rate of 5% p.a. Compound interest is not much different from simple interest as we
        // just add the interest earned each year to our principal of the previous year and then calculate
        // interest over lear and then it LOOPs.

        double p = 10_000; // Principal
        double r = 5; // Rate
        for(int i = 1;i<11;i++){
            double interest = p * r /100;
            p += interest;
            System.out.println("The principal after "+i+" years is "+p+" and the interest was "+interest);
        }
        // This is how the for loop works. Experiment yourself to see the power of loops.
    }
}

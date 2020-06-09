public class A7_Methods {
    public static void main(String args[]) {
        /*
        As we tackle more complex code we will see that we will need the same code in multiple places like in a
         game where the calculation of score and other such parts need to be modular. This increases the
         readability and makes it easier to debug the program. Not only this, but if a change is needed then a
         small change in the method itself would bring changes to all the results. All of this makes the code
         really reusable.

        We can pass data, known as parameters, into a method. The parameters need to be specified with their
         correct data types.

        Methods are also known as functions.

        Warning - If you ever have to copy and paste large chunks of code in your code then you are doing
        something wrong.

        Syntax :-
         public class MyClass {   i
              static void myMethod(data_type parameter1) { // As this method has 'void' it returns nothing. We
              // can set the return type as any data type, but we need to make sure to set the return value for
              // each and every possibility. Not accounting for a single return value could
                System.out.println("I am in myMethod!");
                // return "I am in myMethod"; // This could have been returned if instead of 'void' we used the
                // (correct) data type (in this case it would be) 'String'.
              }

              public static void main(String[] args) {
                myMethod(); // This is how a method is called in the main.
                myMethod();
                myMethod();
              }
            }

        Output :-
         I am in myMethod!
         I am in myMethod!
         I am in myMethod!

         */
        int score = 2000;
        int levelCompleted = 10;
        int bonus = 700;
        int myScore = calculateScore(score, levelCompleted, bonus);
        System.out.println("My score is :- " + myScore);
        // Output - My score is :- 9000

    }

    public static int calculateScore(int score, int levelCompleted, int bonus) {
        int totalScore = score + (bonus * levelCompleted);
        return totalScore;
    }
}

import java.util.Scanner;

public class C12_ReadingInput {
    public static void main(String args[]) {
        // Suppose we want to get the user to enter an input say, your name and age. In the previous section we
        // discussed about parsing values from String. Here we will be talking about taking in user input and
        // printing it and performing operations on it.
        // For reading input we will use the class Scanner. It is a class that can parse primitive data types
        // and String as well. It uses methods such as parseInt() internally.

        Scanner scanner = new Scanner(System.in); // When prompted choose the java.util option.
        // We are using this built-in class to take in user input. We are using 'new' to use an instance of the
        // Scanner class.
        // The 'new' keyword, classes and instances will be seen in future 'OOP' section.
        System.out.println("Enter your age :-");
        // We may encounter two major problems here. The user may enter a negative number or the user may
        // enter an alphabet(s). To check this we will use an if statement to return prompts to help the user
        // enter the right input.
        boolean hasInt = scanner.hasNextInt();// We will be using this to check if the next input will be an int.
        if (hasInt) {
            int age = scanner.nextInt(); // This will read the number.
            if (age > 0 && age <= 100) { // This will check if the age of the user is in valid range.
                scanner.nextLine(); // We are using this line so that the enter is registered separately and we
                // do not skip any nextLine() method. We must always enter this to avoid any skipping.
                // To experience this yourself comment out this statement an then check it will skip the
                // nextLine() method.

                System.out.println("Enter your name :-");
                String name = scanner.nextLine();

                System.out.println("Your name is " + name + " and your age = " + age + " years");
            } else {
                System.out.println("Invalid age!!");
            }
        } else {
            System.out.println("Could not parse the age.");
        }
        scanner.close(); // We are closing the instance of Scanner so that our memory released (and not wasted).
    }
}

import java.util.Scanner;

public class C1_ArraysIntro {
	/* So far in this course we have seen data structures that only store a single value of their type.
	Now, in this section we will be looking at a method to hold multiple values of the same data type in a
	single variable. We will be achieving it using array.
	Arrays can be used to store any number of data of the same data type. It works for all primitive data
	types like int, double, etc., and even objects such as String.
	
	Let's look at an example.
	 
	 */
	private static final Scanner scanner = new Scanner(System.in); // For taking user input.
	
	public static void main(String[] args) {
		int[] myFirstArray = new int[10]; // This is the basic syntax of defining an array. Now we need to
		// input some values let's see how we get about it. The first part is quite similar to actually
		// declaring a primitive data type. Now to make it an array declaration we add "[]" in front of the
		// data type.
		
		myFirstArray[7] = 42; // Now you would think that this would be the 7th element of our glorious
		// array, but no it is the 8th element of our array. It is because java indexes arrays from 0, i.e,
		// the first element of our array has index 0.
		
		System.out.println("The 8th element of the array is :- " + myFirstArray[7]);
		
		double[] mySecondArray = {1, 2, 3, 4, 5, 6, 7}; // This is another way of initializing an array,
		// though it is a bit too cumbersome. Also, most of the times we would like for the user to enter a
		// set of values which we would like to store. So we have another way of doing so.
		// This is the way to initialize an array inline. The "{" and "}" is know as the array initializer
		// block.
		// This method of initializing an array is also know as an anonymous array.
		// Let's check it out.
		
		// Note :- To store the values by the above method we have to ensure that we initialize the array
		// in that specific way, i.e, all the elements have to be entered within a pair of curly braces as
		// shown separated with commas.
		
		// Now lets give values to all the elements of our first array using a for loop.
		
		for (int i = 0; i < 10; i++) {
			myFirstArray[i] = i * 20;
		}
		
		// Now let's see our array (output).
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Index no. " + i + " is " + myFirstArray[i]);
		}
		
		System.out.println("\n\n");
		
		// Here we will be using a very special property(attribute) of arrays called length. This is a very
		// convenient way to take input and also output array. This helps us as there is no need to remember
		// the length of the array anymore. Also if the length of the array changes it won't cause any
		// issues in the code.
		// This makes our code cleaner and also makes it easier to make changes and update the code.
		
		int n = mySecondArray.length; // This will store the length of our second array.
		
		for (int i = 0; i < n; i++) {
			mySecondArray[i] = 101 / (i + 1);
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println("Element no. " + i + " is " + mySecondArray[i]);
		}
		
		System.out.println("\n\n");
		
		// For our second array lets take input from the user(you in this case) itself.
		
		// Now let's see how can we take input from the user into arrays. Also we will have a look at how
		// methods will be created and used for arrays.
		
		int[] myInts = getInts(10); // getInts is our method which returns an array of our integers.
		
		// Creating another method to print all the values of the array myInts.
		
		printInts(myInts);
	}
	
	public static int[] getInts(int len) {
		System.out.println("Enter " + len + " number of elements for the array :-\r");
		int[] val = new int[len];
		
		for (int i = 0; i < val.length; i++) {
			val[i] = scanner.nextInt();
		}
		
		return val;
	}
	
	public static void printInts(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("The element number " + i + " is " + arr[i]);
		}
	}
	
	// This is how arrays work.
	// In this page we have covered the basics of arrays.
	
	// Now I have a challenge for you:-
	// Create a program using arrays that sorts a list of integers in descending order.
	// Descending order is highest value to lowest.
	// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
	// ultimately have an array with 106,81,26, 15, 5 in it.
	// Set up the program so that the numbers to sort are read in from the keyboard.
	// Implement the following methods - getIntegers, printArray, and sortIntegers
	// getIntegers returns an array of entered integers from keyboard
	// printArray prints out the contents of the array and sortIntegers should sort the array and return a
	// new array containing the sorted numbers you will have to figure out how to copy the array elements
	// from the passed array into a new array and sort them and return the new sorted array.
	
	// To see solution see ArrayChallenge1.
	
}

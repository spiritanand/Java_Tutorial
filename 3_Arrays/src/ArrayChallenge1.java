import java.util.Scanner;

public class ArrayChallenge1 {
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the length of your array:-\r");
		int length = scanner.nextInt();
		
		int[] chArray = getIntegers(length);
		System.out.println("\nThe array entered is:-");
		printArray(chArray);
		int[] sortedArray = sortIntegers(chArray);
		System.out.println("\nThe sorted array is:-");
		printArray(sortedArray);
		System.out.println("\nThe array entered was:-");
		printArray(chArray);
		
	}
	
	public static int[] getIntegers(int len) {
		int[] values = new int[len];
		System.out.println("Enter the elements of your array:-\r");
		for (int i = 0; i < values.length; i++) {
			values[i] = scanner.nextInt();
		}
		return values;
	}
	
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Element " + i + " is " + arr[i]);
		}
	}
	
	public static int[] sortIntegers(int[] arr) {
		 
		
		int n = arr.length;
		int[] arr_c= new int[n];
		for (int i =0; i<n;i++){
			arr_c[i]= arr[i];
		}
		
		// Here we are using bubble sort to get our array sorted in a descending way.
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr_c[j] < arr_c[j + 1]) {
					// swapping arr_c[j+1] and arr_c[j]
					int temp = arr_c[j];
					arr_c[j] = arr_c[j + 1];
					arr_c[j + 1] = temp;
				}
		return arr_c;
	}
	
	
}

import java.util.Scanner;

public class C4_InsDel {
	// In this code block we will see how to insert or delete an element from an array.
	
	public static void main(String[] args) {
		/*
		 Inserting an element at the end of an array (in which the size is not full yet) is a quite
		 trivial task. We just need to input the value of the element just after the last entry. You can
		 figure this one yourself.
		 
		 But in the case that the size of the array is full and we need to append an element at the end of
		 the array we need to copy all the values of the array to a new array whose length is one greater
		 than the previous one. Then the element can be easily appended to the array.
		 
		 We have another case on our hands when inserting elements. Inserting an element in the
		 middle(anywhere in the array except the end) of the array we will have to shift half of the
		 array (on average) on the right and then insert the element.
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = new int[25];
		System.out.println("Enter the number of elements in your array:-");
		int n = scanner.nextInt();
		System.out.println("Enter the elements of your array:-");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		for (int i = 0; i < n; i++) {
			System.out.println("arr[" + i + "] is " + arr[i]);
		}
		System.out.println("Enter the number you want inserted in your array:-");
		int num = scanner.nextInt();
		System.out.println("Enter the position to be inserted in your array:-");
		int pos = scanner.nextInt();
		
		for (int i = n - 1; i >= pos - 1; i--) {
			arr[i + 1] = arr[i];// We are shifting the whole array to the right by 1 position from the
			// position where we want to insert the number.
		}
		arr[pos - 1] = num; // Re-assigning the position to the number entered by the user.
		n++;// Increasing the size of the array for our user.
		System.out.println("\nThe new array is:-");
		for (int i = 0; i < n; i++) {
			System.out.println("arr[" + i + "] is " + arr[i]);
		}
		
		// Similar to inserting an element in an array removing an element(deleting) from an array is done
		// in a similar way. In this we shift the array to the left by 1 position from where the element is
		// to be removed.
		
		System.out.println("Enter the position you want deleted in your array:-");
		int pos_del = scanner.nextInt();
		
		if ((pos_del > n) || pos_del < 0) {
			System.out.println("\nThe new array is same as before:-");
			for (int i = 0; i < n; i++) {
				System.out.println("arr[" + i + "] is " + arr[i]);
			}
		} else {
			int[] new_arr = new int[n - 1];
			for (int i = 0, j = 0; i <= new_arr.length; i++) {
				if (i == pos_del - 1) {
					continue;// This will skip assigning the value to position the user wants deleted.
				}
				new_arr[j++] = arr[i];// We are copying every other element to this new array.
			}
			n--;// Decreasing the size of the array.
			System.out.println("\nThe new array is:-");
			for (int i = 0; i < n ; i++) {
				System.out.println("new_arr[" + i + "] is " + new_arr[i]);
			}
		}
	}
}

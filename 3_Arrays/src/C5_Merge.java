import java.util.Arrays;

public class C5_Merge {
	/*
	 Sometimes we would like to merge two or more arrays. Merging two arrays(linear) is pretty straight
	 forward. We need to create a new matrix whose length is the sum of the previous two arrays. The next
	 step is to simply copy the values of each element to the newly created array.
	*/
	
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {10, 20, 30};
		int n = arr1.length + arr2.length; // Adding the length of both the arrays.
		int[] arr3 = new int[n];
		// Loop to copy the values of the arr1 to the new array.
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		// To copy the values of arr2
		for (int i = 0; i < arr2.length; i++) {
			arr3[arr1.length + i] = arr2[i];
		}
		System.out.println("The merged array is:- " + Arrays.toString(arr3));
	}
}

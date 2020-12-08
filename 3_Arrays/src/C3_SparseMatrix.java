import java.util.Arrays;

public class C3_SparseMatrix {
	// A matrix in which most of the elements(more than size/2 of the array) are zero is called a sparse
	// matrix.
	
	public static void main(String[] args) {
		// Let's check if the matrix entered by the user is a sparse matrix.
		
		int[][] spe_arr = {
				{0, 3, 0, 5},
				{0, 0, 4, 0},
				{2, 0, 0, 9}
		};
		
		// Let's calculate the size of this array.
		double sz = spe_arr.length * spe_arr[0].length;
		
		int count = 0; // This variable will store the number of non zero terms in the array.
		
		for (int i = 0; i < spe_arr.length; i++) {
			for (int j = 0; j < spe_arr[i].length; j++) {
				if (spe_arr[i][j] != 0)
					count++;
			}
		}
		
		if ((sz - count) > sz / 2) {
			System.out.println("Sparse Matrix");
		} else {
			System.out.println("Not sparse matrix");
		}
		
		/*
		 It is evident that in a sparse matrix most of the elements are 0, so it is a waste of storage to
		 store the non-zero elements in such a way. Instead it is more prudential to store the elements in a
		 3 row array. In this array the location and the value of the element is stored in columns. The first
		 element of the column is the row number of that element. Then on the second row the second member of
		 the column is the column number of that element. On the third row the last member of the the column
		 is the actual value of that non-zero element from the sparse matrix.
		 
		 Take some time to visualize this paragraph.
		 
												Read it TWICE.
		*/
		
		int[][] comp_arr = new int[3][count];
		int k = 0; // This variable will store the column number which we will be accessing.
		
		for (int i = 0; i < spe_arr.length; i++) {
			for (int j = 0; j < spe_arr[i].length; j++) {
				if (spe_arr[i][j] != 0){
					comp_arr[0][k]=i;
					comp_arr[1][k]=j;
					comp_arr[2][k]=spe_arr[i][j];
					k++;
				}
			}
		}
		
		for (int i = 0; i < comp_arr.length; i++) {
					System.out.println(Arrays.toString(comp_arr[i])); // Try to visualize this output
			// before running the program.
		}
	}
}

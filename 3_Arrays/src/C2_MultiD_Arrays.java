import java.util.Arrays;

public class C2_MultiD_Arrays {
	/* The arrays we have seen till now have been 1-dimensional or linear arrays(LA). Here data is only
	stored in a linear format i.e., there are multiple values in a single row/column.
	In this section we will be looking at multi-dimensional arrays. In a multi-dimensional array the
	possibilities are infinite. We can have multiple rows and columns of data.
	 */
	
	public static void main(String[] args) {
		// Syntax of a multi-dimensional array is :-
		// data_type[1st dimension][2nd dimension]...[Nth dimension] array_name =
		// 															new data_type[size1][size2]….[sizeN];
		
		// Examples:-
		
		// 2D arrays -

//		Indirect Method of Declaration:
//		Declaration :
//		data_type[][] array_name = new data_type[rows_size][columns_size];
//		For example: int[][] arr_ex = new int[20][123];
//
//		Initialization :
//		array_name[row_index][column_index] = value;
//		For example: arr_ex[3][5] = 42;

//		Direct Method of Declaration:
//		data_type[][] array_name = {
//				{valueR1C1, valueR1C2, ....},
//				{valueR2C1, valueR2C2, ....}
//                           		};
//		R= row and,
//		C= column.
//
//		For example: int[][] arr_ex = {
//										{6, 42},
//										{36, 24}
//									}
		
		int[][] arr1 = {
				{1, 2, 3},
				{10, 20, 30},
				{100, 200, 300}
		};
		
		// Accessing an element of the array is done as follows:-
		// arr_ex[row_index][column_index];
		
		System.out.println(arr1[1][2]); // Should print 30 in this case.
		
		// Let's see how we can traverse through this array.
		// One way to traverse all the elements of the array is through a nested loop.
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.println("arr[" + i + "][" + j + "] is " + arr1[i][j]);
			}
		}

//		System.out.println(Arrays.toString(arr1));
		// Uncomment the above line of code to see what is the output. You will be surprised 😉.
		
		
		
		// 3D arrays -
//
//		Indirect Method of Declaration:
//		Declaration:
//		data_type[][][] array_name = new data_type[x][y][z];
//		For example:
		int[][][] arr2 = new int[10][20][30];
//
//		Initialization:
//		array_name[array_index][row_index][column_index] = value;
//		For example:
		arr2[5][2][7] = 30;

//		Direct Method of Declaration:
//		data_type[][][] array_name = {
//				{
//						{valueA1R1C1, valueA1R1C2, ....},
//						{valueA1R2C1, valueA1R2C2, ....}
//                              },
//		{
//						{valueA2R1C1, valueA2R1C2, ....},
//						{valueA2R2C1, valueA2R2C2, ....}
//		}
//                             };
//		A= array;
//		R= row ;
//		C= column.

//		For example:
		int[][][] arr3 = {
				{ // This is the first array.
						{10, 20},// Row 1 of the first array.
						{35, 45} // Row 2 of the first array.
				},
				{ // This is the second array.
						{50, 60}, // Row 1 of the second array.
						{75, 85}  // Row 2 of the second array.
				}
		};
		
//		Accessing the elements can be done as arr_ex[array_index][row_index][column_index]
		System.out.println(arr3[1][0][1]); // Should output 60 in this case.
		
//		Traversing through a 3D array.
		System.out.println(Arrays.toString(arr3[1][1]));
		
//		Traversing using nested loops.
		for (int i=0;i< arr3.length;i++){
			for(int j=0;j<arr3[i].length;j++){
				for (int k=0;k<arr3[i][j].length;k++){
					System.out.println("arr3["+i+"]["+j+"]["+k+"] is "+arr3[i][j][k]);
				}
			}
		}
	}
}

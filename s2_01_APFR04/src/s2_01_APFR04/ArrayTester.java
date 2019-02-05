package s2_01_APFR04;

import java.util.Arrays;

/**
 * 
 * @author compsci
 *
 */

public class ArrayTester {

	
	
	
 /*
// RETURN FALSE
	static int[][] arr2D = { {0, 1, 2},
					  {3, 4, 5},
					  {6, 7, 8},
					  {9, 5, 3} };
*/
	
	

// RETURN TRUE
	static int[][] arr2D = {{1, 2, 3},
			  				{2, 3, 1},
			  				{3, 1, 2} };


	

	/*
	// RETURN TRUE
		static int[][] arr2D = {{5, 7, 6},
				  				{6, 5, 7},
				  				{7, 6, 5} };
	*/
	
	
/*
// RETURN TRUE
	static int[][] arr2D = {{10, 30, 20, 0},
			  				{0, 20, 30, 10},
			  				{30, 0, 10, 20},
			  				{20, 10, 0, 30} };
*/
	
	

	/**
	 * Returns an array containing the elements of column c of arr2D in the same
	 * order as they appear in arr2d
	 * Precondition: c is a valid column index in arr2D
	 * Postcondition: arr2D is unchanged 
	 * +1 point -- Constructs a new int array of size arr2D.length
	 * +1 point -- Access all items in one column of arr2D
	 * +1 point -- Assigns one element from arr2D to the corresponding element in the new array
	 * +1 point -- ON EXIT: The new array has all the elements from the specified column in arr2D in the correct order
	 */
	
	public static int[] getColumn(int[][] arr2D, int c) {
		int[] result = new int[arr2D.length];
		
		for (int r = 0; r < arr2D.length; r++) {
			result[r] = arr2D[r][c];
		}
		return result;
	}
	
	/**
	 * Returns true if and only if every value in arr1 appears in arr2
	 * Precondition: arr1 and arr2 have the same length
	 * Postcondition: arr1 and arr2 are unchanged
	 */
	
	public static boolean hasAllValues(int[] arr1, int[] arr2) {
		boolean retro = true;
		int k =0;
		for (int i = 0; i < arr1.length; i ++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					k+=1;
				}
			
			
			}
			
		}
		if (k == arr1.length) {
			retro = true;
		}
		else {
			retro = false;
		}
		return retro;
		
	}

	/**
	 * Returns true if arr contains any duplicate values;
	 * 		false otherwise
	 */

	public static boolean containsDuplicates(int[] arr) {
		boolean retro = false; 
		if (arr.length > 2) {
			
		}
		for (int i = 0; i < arr.length -1; i++) {
			if (arr[i] == arr[i+1]) {
				retro = true;
			}
			else {
				retro = false; 
			}
		}
		if (retro == false){
		}
		else {
		}
		return retro; 
		
	}

	/**
	 * Returns true if square is a Latin square as described in part b;
	 * 		false otherwise 
	 * Precondition: square has an equal number of rows and columns 
	 * 				 square has at least one row
	 * +1 point -- Calls containsDuplicates referencing a row or column of square
	 * +1 point -- Calls hasAllValues referencing two different rows, two different columns, or one row and one column
	 * +1 point -- Applies hasAllValues to all rows or all columns 
	 * +1 point -- Calls getColumn to obtain a valid column from square
	 * +1 point -- Returns true if all three Latin square conditions are satisfied, false otherwise
	 */

	public static boolean isLatin(int[][] square) {
		if (containsDuplicates(square[0])) {
			return false;
			}
		for (int r = 1; r < square.length; r++) {
			if (!hasAllValues(square[0], square[r])) {
				return false;
			}
		}
		for (int c = 0; c < square[0].length; c++) {
			if (!hasAllValues(square[0], getColumn(square, c))) {
				return false;
			}
		}
		return true;
		}
		
	
	
	
	public static void main(String[] args) {
		boolean latinSquare = ArrayTester.isLatin(arr2D);
		System.out.println(latinSquare);
	}

}




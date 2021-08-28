	/*
	 * Pseudo Code
	
	 * a) Declare An array for {3,2,11,4,6,7};	 
	 * b) Declare another array for {1,2,8,4,9,7};
	 * c) Declare for loop iterator from 0 to array length
	 * d) Declare a nested for another array from 0 to array length
	 * e) Compare Both the arrays using a condition statement
	 
	 *  f) Print the first array (shoud match item in both arrays)
	 */


package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersectionOfArray {

	public static void main(String[] args) {

		Integer arr1[] = {3,2,11,4,6,7};
		Integer arr2[] = {1,2,8,4,9,7};

		List<Integer> intList1 = new ArrayList<Integer>();
		intList1.addAll(Arrays.asList(arr1));

		List<Integer> intList2 = new ArrayList<Integer>(Arrays.asList(arr2));

		intList2.retainAll(intList1);
		System.out.println("Arr1 values duplicated in Arr2: " + intList2);

}

}

		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the 2nd element from the last and print it
		 */


package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestInArray {

	public static void main(String[] args) {

		int[] arr = { 3, 2, 11, 4, 6, 7 };

		List<Integer> arrList = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			arrList.add(arr[i]);
		}
		Collections.sort(arrList);
		int len = arrList.size();
		System.out.println("2nd largest number is: " + arrList.get(len - 2));

	}

}
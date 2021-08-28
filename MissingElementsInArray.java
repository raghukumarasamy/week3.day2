// Here is the input
// int[]arr={1,2,3,4,7,6,8};
// Sort the array	
// loop through the array (start i from arr[0] till the length of the array)
// check if the iterator variable is not equal to the array values respectively
// print the number
// once printed break the iteration

package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;

public class MissingElementsInArray {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 3, 5, 6, 7, 8, 9 };
		List<Integer> arrList1 = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			arrList1.add(arr[i]);
		}
		int length = arrList1.size();
		for (int i = 0; i < length; i++) {
			if (i != arrList1.get(i)) {
				System.out.println("The missing elements are : " + i);
				break;
			}

		}

	}

}
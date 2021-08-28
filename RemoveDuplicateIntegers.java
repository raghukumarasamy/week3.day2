package week3.day2.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateIntegers {

	public static void main(String[] args) {
		int arr[] = {3,2,11,4,6,7,5,6,9,1,4,6,7,9,4};
		Set<Integer>arrList1  = new LinkedHashSet<Integer>();
		for(int i=0 ; i<arr.length ;i++) {
			arrList1.add(arr[i]);
		}
		System.out.println("Duplicate removed :" + arrList1);
	}

}
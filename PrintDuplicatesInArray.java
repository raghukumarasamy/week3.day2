// int[]arr={14,12,13,11,15,14,18,16,17,19,18,17,20};
// get the length of the array
// declare an int variable named count
// iterate from 0 to the array length-1 (outer loop starts here)
// assign 0 to count 
// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
// compare both the loop variables & check they're equal
// increase the count if both the arrays are equal
// Out of the inner loop, check and print the first array variable if count is more than 0

package week3.day2.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int arr[] = {3,2,11,4,6,7,5,6,9,1,4,6,7,9,4};
		Set<Integer>arrList1  = new LinkedHashSet<Integer>();
		Set<Integer>arrayDups  = new LinkedHashSet<Integer>();
for(int i : arr) {
if(arrList1.add(i)==false) {
	arrayDups.add(i);
}
	}
System.out.println("The duplicates are : " + arrayDups);
}}

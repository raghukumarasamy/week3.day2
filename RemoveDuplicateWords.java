	/*
	 * Pseudo code 
	 
	 * a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";		
	 * b) Initialize an integer variable as count	  
	 * c) Split the String into array and iterate over it 
	 * d) Initialize another loop to check whether the word is there in the array
	 * e) if it is available then increase and count by 1. 
	 * f) if the count > 1 then replace the word as "" 
	 
	 * g) Displaying the String without duplicate words	
	 */

package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {

		String str = "We learn java basics as part of java sessions in java week1";
		String[] splitStr = str.split(" ");
		
		List<String> str1=new ArrayList<String>(Arrays.asList(splitStr));
		
		int strLen=str1.size();
		
		 Set<String> hashSet = new LinkedHashSet(str1);
	        ArrayList<String> removedDups = new ArrayList(hashSet);
        
        for(int i=0;i<removedDups.size();i++) {
        	System.out.print( removedDups.get(i)+ " ");
        }
		

	}

}

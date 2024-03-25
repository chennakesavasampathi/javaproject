package javapractice;

import java.util.Arrays;

public class SortBasedOnStringDataUsingArraysClassMethods {

	public static void main(String[] args) {
		String[] names= {"chenna","thirumala","jaswanth"};
		Arrays.parallelSort(names);
		
		
		for(String str:names) {
			System.out.println(str);
			
		}
		
		System.out.println(Arrays.toString(names));
		
		
	}
	
	
}

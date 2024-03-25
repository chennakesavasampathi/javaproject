package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerElementsSorting {
	public static void main(String[] args) {
		ArrayList<Integer>integer=new ArrayList<>(); 
		integer.add(2);
		integer.add(3);
		integer.add(22);
		integer.add(20);
		integer.add(30);
		System.out.println("This is insertion order\n\"How we add one by one elements into arraylist same way the elements are prints\" ");
		System.out.println(integer);
		
		System.out.println("after sorting integer elements using sort method in Collections class ");
		
		Collections.sort(integer);
		for(Integer integers:integer) {
			System.out.println(integers);
		}
		
	}

}

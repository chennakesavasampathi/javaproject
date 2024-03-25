package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SotingStringElements {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("chennakesava");
		names.add("thirumala");
		names.add("jesawnth");
		names.add("bharathi");
		System.out.println("this is an insertion order ");
		System.out.println(names);
		for(String tem:names) {
			
			System.out.println(tem);
		}
		
		System.out.println("after sorting String Elements");
		Collections.sort(names);
		System.out.println(names );
		for(String temp:names) {
			System.out.println(temp);
		}
	}
}

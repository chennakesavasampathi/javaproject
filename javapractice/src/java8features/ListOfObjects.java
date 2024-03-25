package java8features;

import java.util.ArrayList;
import java.util.List;

public class ListOfObjects {
	
	public static void main(String[] args) {
		
		
		
		List<String> list=new ArrayList<>();	
		
		list.add("chennakesava");
		list.add("kesava");
		list.add("siva");
		list.add("shannu");
	
		
		list.stream().forEach(k->System.out.println(k));
		
		
		
	}

	

}

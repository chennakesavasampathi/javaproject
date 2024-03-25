package javapractice;

import java.util.ArrayList;
import java.util.Collections;

public class SortTheStringDataUsingCollectionsClassMethod {
public static void main(String[] args) {
ArrayList<String> names=new ArrayList<>();	
names.add("thirumala");
	names.add("chennakesava");
	System.out.println(names);
	Collections.sort(names);
	
	System.out.println(names );
}
}

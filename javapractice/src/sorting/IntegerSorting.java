package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerSorting {
public static void main(String[] args) {
	ArrayList<Integer> integerlist=new ArrayList<Integer>();
	integerlist.add(15);
	integerlist.add(1);
	integerlist.add(25);
	integerlist.add(35);
	integerlist.add(5);
	integerlist.add(10);
	System.out.println("insertion order of elements");
	Myutillity my=new Myutillity();
	
	my.extracted2(integerlist);
	
	System.out.println("after sorting the elements ");
	Collections.sort(integerlist);
	my.extracted2(integerlist);
	
	
	
}


}

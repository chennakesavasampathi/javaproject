package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class StringSortingDemo {
public static void main(String[] args) {
	ArrayList<String> stringlist=new ArrayList<String>();
	stringlist.add("kushi");
	stringlist.add("aaradhya");
	stringlist.add("naa roja nuvve");
	stringlist.add("ravanaasura");
	stringlist.add("hukum");
	
	System.out.println(" elements in insertion order");
	System.out.println("");
	Myutillity my=new Myutillity();
	
	my.extracted2(stringlist);
	
	Collections.sort(stringlist);
	System.out.println("   ");
	System.out.println("after sorting elements");
	System.out.println("  ");
	my.extracted2(stringlist);
	
	
	
}


}


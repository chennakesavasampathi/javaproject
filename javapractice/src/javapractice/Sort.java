package javapractice;

import java.util.Arrays;

public class Sort {
public static void main(String[] args) {
	int[] a= {10,20,40,30};
	int numners=a.length;
	
	System.out.println(numners);
	
int b[]= {30,49,34,54,};
System.out.println(b[0]);
System.out.println(b[1]);
System.out.println(b[2]);
System.out.println(b[3]);
Arrays.parallelSort(b);
System.out.println("int[] b elements sort by "+Arrays.toString(b));
	
	System.out.println("array elements before sorting "+Arrays.toString(a));
	
	
	 Arrays.parallelSort(a);
	 System.out.println("after elements sorting "+Arrays.toString(a));
	
}
}

package wrapperclasses;

public class ObjectToString {
	public static void main(String[] args) {
		
//		we hava two approches to converts object of Integer type to object of String typ int value 
		
//		1. using wrapper class object reference.toString() method present in Integer class 
//		2.using cancatination with reference variable of wrapper class like in+ ""
		
		
		Integer in=10;
		String str=in.toString();
		System.out.println(str+"Integer object into string type "
				+ "integer using Integer reference variable.toString()");
		
		
		Integer in2=Integer.valueOf(30);
		String str2=in2+"";
		System.out.println(str2);
		
	}
	
	
	
	
	
	

}

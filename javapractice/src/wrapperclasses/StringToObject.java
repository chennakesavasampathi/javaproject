package wrapperclasses;

public class StringToObject {
public static void main(String[] args) {
	String integer="10";
	
//	Integer i100="25"; string is object so auto boxing is not happen to string type  auto boxing is happen only to primitive type values 
	
	Integer in4=new Integer("10");
	Integer in3=Integer.valueOf("200");
	  int str=in3;
	  
	System.out.println(str);
	
	
	String str2="223";
	
	Integer Int=Integer.valueOf(str2);
	System.out.println(Int);
	
	
}
}

package javaprograms;

public class RemoveSpacesInAString {
public static void main(String[] args) {
	String str="java is a programming language";
	String name="sampathi chennakesavulu ";
	 
	System.out.println("before removing spaces in a string "+ str);
	 String str1= str.replace(" ","");
	 System.out.println("after removing spaces in a string "+str1);
	
	String name1=name.replaceAll("\\s","" );
	System.out.println( name1);
}
}

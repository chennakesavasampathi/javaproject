package javaprograms;

import java.util.Scanner;

public class CheckGivenStringIsPalindromeOrNot {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	
	String str=sc.next();
	String originalstring=str;
	String  rev= "";
	
	int len=str.length();
	
	
  for(int i=len-1;i>=0;i--) {
	 rev=rev+str.charAt(i);
	
	 

	 } 
  if(originalstring.equals(rev)) {
	  System.out.println(str+"  is the palindrome string");
  }
  else {
	  System.out.println(str+"  is the not palindrome string");  
  }
	  
  
	
}
}

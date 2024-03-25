package javapractice;

public class Palindromeone {
public static void main(String[] args) {
	String str="madam";
	String reverse="";
	
	for(int i=str.length()-1;i>=0;i--) {
		
		reverse+=str.charAt(i);
	
	}
	
	if(str.equals(reverse)) {
		System.out.println("string is palindrome");
		
		
	}
	else {
		
		
		System.out.println("given string is not palindrome");
	}
}
}

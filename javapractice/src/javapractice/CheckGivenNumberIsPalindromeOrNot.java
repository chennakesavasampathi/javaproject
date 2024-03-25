package javapractice;

public class CheckGivenNumberIsPalindromeOrNot {
public static void main(String[] args) {
	String str="madam";
	String reverse="";
	
	int lenthofreverse=reverse.length();
	System.out.println(lenthofreverse);
	for(int i=str.length()-1;i>=0;i--) {
		reverse=reverse+str.charAt(i);
		
	}
//	System.out.println(str);
//	System.out.println(reverse);

	
	if(str.equals(reverse)) {
		System.out.println(str+"-is palindrome");
		
		
	}
	else {
		System.out.println(str+"-is not palindrome");
		
		
	}
	
}
}

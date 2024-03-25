package javaprograms;

import java.util.Scanner;

public class PalindromeNumberOrNot {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the numner");
	int num=sc.nextInt();
	int originalnumber=num;
	
	int rev=0;
	while(num!=0) {
		
		rev=rev*10+num%10;
		num=num/10;
		
		
	}
if(originalnumber==rev) {
	
	System.out.println(originalnumber+"  given number is palindrome");
}
else {
	
	System.out.println(originalnumber+"  given number is not palindrome");
}
}
}

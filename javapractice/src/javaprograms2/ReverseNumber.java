package javaprograms2;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		System.out.println("please enter the number");
		System.out.println(number);
		
		int reverse=0;
		while(number!=0) {
			
			reverse=number%10;
			
			number=number/10;
			
			System.out.print(reverse);
			
		}
		
		
		
		
		
	}

}

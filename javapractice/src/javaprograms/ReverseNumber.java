package javaprograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");

    int num=sc.nextInt();
   /* int rev=0;
    while(num!=0) {
    	
    	rev=rev*10+num%10;
    	num=num/10;
    	
    }*/
    
//    using stringbuffer class
   /* StringBuffer sb=new StringBuffer(String.valueOf(num));
    StringBuffer rev=sb.reverse();*/
    
    
//    using stringbuilder
    StringBuilder sb=new StringBuilder();
    sb.append(num);
    StringBuilder rev=sb.reverse();    
    System.out.println("reverse the number "+rev);
}
}


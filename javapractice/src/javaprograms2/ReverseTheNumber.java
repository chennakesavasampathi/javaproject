package javaprograms2;

import java.util.Scanner;

public class ReverseTheNumber {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number ");
int num= sc.nextInt();  //1234

/* 1.using algorithm 
int rev=0;//1.rev becomes 4
//2.rev becomes 43
//3.rev becomes 432
//4.rev 4321


 while(num!=0) { 
	 //1. num is 123 so condition is true 
	 //2.num is 12 so condition is true 
	 //3.num becomes 1 so con is true 
	 //4.num becomes 0 so con is false 
	 //so loop is terminated here enter into out of the block 
	 rev=rev*10+num%10;
	 //1.R=0+1234/10=4 take last num while divide with % 
	 //2.R=4*10+123%10 =40+any num%10 is take last num so num=3 40+3=43
	 // 3.r=43*10+12%10=430+2=432 rev becomes 432
	 // 4.rev =432*10+1%10= 4321
	 // so rev becomes 4321
	 num=num/10;
	 // num=1234/10=123 eliminate last num while div with / 
	 // num becomes 123
	 //2.num=123/10=eliminate last num so num becomes 12
	 //3.num=12 so num/10 so eliminate last numm so num become 1
	// 4.num =1 so num/10=0 so num becomes 0
	 
 }
 // so con is fail so control is comes here 
 System.out.println(rev);
 System.out.println(1%10);
 System.out.println(1/10);

*/

StringBuffer sb=new StringBuffer(String.valueOf(num));
System.out.println("before reverse "+sb);
StringBuffer  rev=sb.reverse();

System.out.println("after reverse the number "+rev);







}
}

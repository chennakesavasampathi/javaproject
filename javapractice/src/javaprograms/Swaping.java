package javaprograms;

public class Swaping {
public static void main(String[] args) {
	
	int firstno=10;
	int secondno=20;
	
	System.out.println("before swaping the values are "+firstno+" "+secondno);
//	logic one - third variable
/*int third=firstno;
	  firstno=secondno;
	  secondno=third;
	  System.out.println("after swaping the values "+firstno+" "+secondno);*/
	
	  
//	  logic 2-using + and - arithmetic operators with out third variable
	  
	 /*firstno=firstno+secondno;  //10+20=30
	 secondno=firstno-secondno;// 30-20=10
	 firstno=firstno-secondno; //30-10=20
	 System.out.println("after swaping values "+firstno+" "+secondno);*/
//	logic 3 -use * and /  without using third variable 
// here a and b values should not be zero  even one of the values should not be zero
	/* firstno=firstno*secondno;
	 secondno=firstno/secondno;
	 firstno=firstno/secondno;
	 System.out.println("after swaping values are "+firstno+" "+secondno);*/
//	logic 4 - bitwise operator XOR (^)
	/*firstno=firstno^secondno;
	secondno=firstno^secondno;
	firstno=firstno^secondno;
	System.out.println("after swaping values"+firstno+" "+secondno );
	*/
//	logic 5 - single statement
//	firstno=10
//	secondno=20
	
	secondno=firstno+secondno-(firstno=secondno); //execute right to left 
//	second value assigned to firstno 
//	firstno will become 20 and
//	firstno+secondno produces 30
//	so 30-20=10
//	b becomes 10
//	still a values becomes 20
	
	System.out.println(" after swaping values"+firstno+" "+secondno);
	
	
}
}

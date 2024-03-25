package javapractice;

public class ExaminationOfJavaRules {
	
	static int numberOne;
	
	static public void m2() {
		
		int a=10;
		System.out.println(a+"m2 method");
	}
	
	public void m1() {
		int no1=10;
		int no2=20;
		final int no=20;
		System.out.println(no1);
		System.out.println(no2);
		System.out.println(no);
	}
	
public static void main(String[] args) {
	int number=10;
	  numberOne=100;
	  System.out.println(numberOne);
	System.out.println(number);
	ExaminationOfJavaRules ExaminationOfJavaRules=new ExaminationOfJavaRules();
	ExaminationOfJavaRules.m1();
	ExaminationOfJavaRules.m2();
	
}
}

package javapractice;

public class Test1 {
	
	static int x=10;
	int y=20;
	 static void method1() {
		
		System.out.println("this is static method ");
	}
	
	
public static void main(String[] args) {
	x=55;
	Test1 test=new Test1();
	test.x=23;
	
	System.out.println(test.x);
	System.out.println(x);
	method1();
	Test1.method1();
	
//	Test1 test=null;
//	test.method1();
//	System.out.println(test.x);
//	System.out.println(x);
//	Test1 test2=null;
//	test2.y=40;
//	System.out.println(test2.y);
//	test.x=30;
//	
//	
//	System.out.println(test.x);
//	test.method1();
//	
}
}

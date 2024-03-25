package javapractice;

public class Test123 {
public static void main(String[] args) {
	try {
		ExceptionHandlingProgramUsingThrowKw eh=new ExceptionHandlingProgramUsingThrowKw();
		int res=eh.m1(2, 45);
		System.out.println(res);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
}
}

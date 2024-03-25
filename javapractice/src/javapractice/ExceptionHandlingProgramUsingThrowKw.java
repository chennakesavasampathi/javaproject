package javapractice;

public class ExceptionHandlingProgramUsingThrowKw {

	public int m1(int a, int b) {
		
		if(a<=0||b<=0) {
			
			throw new IllegalArgumentException("don't pass negative number");
			
		}
		
		
		return a+b;
		
		
		
	}
	
}


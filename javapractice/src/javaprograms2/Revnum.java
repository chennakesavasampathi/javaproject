package javaprograms2;

public class Revnum {

	public static void main(String[] args) {
		int number=1234;
		int reverse;
		while(number!=0) {
			reverse=number%10;
			number=number/10;
			System.out.println(reverse);
			
		}
	}
	
	
}

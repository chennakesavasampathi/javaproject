package javapractice;

public class CommandLineArguments {
	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);

			int b = Integer.parseInt(args[1]);
			
			int c=a/b;
			
			System.out.println("the division is"+c);
		}

		catch (ArithmeticException e) {
System.out.println("don't pass second number is zero");
		}
		
		
		catch(NumberFormatException e) {
			System.out.println("please pass int values ");
			
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("don't pass more than two numbers ");
		}
		
	}
}

package exceptions;

public class ArithmeticExceptionDemo  {

	public int add(int a, int b) {

		return a + b;
	}

	public int division(int c, int d) {
		if (d == 0) {
			throw new ArithmeticException("don't pass second zero");
		} else {
			return c / d;
		}
	}

}

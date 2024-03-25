package java8features;

public class SumOfTwoNumbers {

	/*
	 * @Override public int add(int i, int j) { return i+j; }
	 * 
	 * public static void main(String[] args) { SumOfTwoNumbers sumOfTwoNumbers=new
	 * SumOfTwoNumbers(); int k=sumOfTwoNumbers.add(5, 6); System.out.println(k); }
	 */
	public static void main(String[] args) {

		Addition addition=(i,j)->i+j;
		int k=addition.add(5,6);
		
	System.out.println(k);

		
	}
	
	

}

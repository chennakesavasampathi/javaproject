package javapractice;

public class Swapping {
	public static void main(String[] args) {
		int firstNo = 10;
		int secondNo = 20;
		int temperaryNo;
		/*
		 * // System.out.println("before swapping the no the values are" + firstNo + " "
		 * + secondNo); ////i want to store firstno into second number then tem should
		 * be 10 // temperaryNo = firstNo;// here tem become 10 // // firstNo =
		 * secondNo; // secondNo = temperaryNo; //
		 * System.out.println("after swapping the numbers the vales are "+firstNo+" "
		 * +secondNo);
		 */		
		
		temperaryNo=firstNo+secondNo;//value is 30
		firstNo=temperaryNo-firstNo;//values is 20
		secondNo=temperaryNo-firstNo;//values is 10
		 System.out.println("after swapping the no's "+firstNo+""+secondNo);

	}
}

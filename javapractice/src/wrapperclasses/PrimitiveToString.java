package wrapperclasses;

public class PrimitiveToString {
	public static void main(String[] args) {
		
		
//		we have to approaches to convert primitiva values into String type integer values 
//		1.using Integer.toString(primitive value of integer );
		
//		2.using empty string literal with concatination operator + primitive value(""+primitive value )
		int in=20;
		String str=Integer.toString(in);
		System.out.println(str);
		
		int num=1;
		String newnum=""+num;
		System.out.println("newnum");
	}

}

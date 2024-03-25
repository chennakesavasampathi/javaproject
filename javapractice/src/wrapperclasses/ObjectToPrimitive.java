package wrapperclasses;

public class ObjectToPrimitive {
	public static void main(String[] args) {
		
//		we have two approches to convert Wrapper class object type  into primitive type
//		1. we have intValue() for Integer object to primitive type and Short to short shortValue()
		//etc.. methods are there for all warapper class returns primitive values 
		Integer in=new Integer(100);
		System.out.println(in);
		Integer in2=new Integer(200);
	      int i2=in2.intValue();
	      System.out.println(i2+"using intValue() we are converts object into primitive value ");
		
		
//		2. we have auto un boxing mechanisam to converts object to primitive 
	      
	      Integer i3=Integer.valueOf(i2);
	      int i4=i3;
	      
		System.out.println(i4);
		
		Integer i12=100;
		int i20=i12;
		System.out.println(i20);
		
		
		
		
		
		
		
	}

}

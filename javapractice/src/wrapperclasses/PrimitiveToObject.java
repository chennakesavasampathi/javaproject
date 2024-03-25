package wrapperclasses;

public class PrimitiveToObject {

// we have three approches to convert primitive type values into object Type
// values
//	1.using constructer from all wrapper classes 
//	2.using static method from  all wrapper classes
//  3.Auto -boxing mechanism

	public static void main(String[] args) {
		// we take number type values using short byte int long double float
		// int type value

//		1.using constructer from all wrapper classes like Integer(int),Short(short);
		// Double(double)
		int a = 10;
		// short type value
		short s = 20;
		byte b = 30;
		long l = 40;
		float f = 5.0f;
		double d = 56.4d;

		Boolean boo = new Boolean(true);

		System.out.println("Boolean object=" + boo);

		Character ch = new Character('a');

		System.out.println("Character object=" + ch);

		Integer in = new Integer(a);// int
		Short si = new Short(s);
		Byte bt = new Byte(b);

		Long lo = new Long(l);

		System.out.println("Byte object=" + bt);
		System.out.println("short object=" + si);

		System.out.println("Integer object=" + in);

		System.out.println("Long object=" + lo);

		Float fl = new Float(f);
		System.out.println("Float object=" + fl);

		Double dl = new Double(d);
		System.out.println("Double Object=" + dl);

// approach 2 using static method valueOf() in all Wrapper classes 
		
		int z=129;
		Integer in2=Integer.valueOf(z);
		System.out.println("primitive value converts into integer object using static method of valueOf () inside Integer Wrapper class "+in2);
		
		
		short s11=11;
		Short so=Short.valueOf(s11);
		System.out.println("primitive value changed into object using static method of Short look like public static Short valueOf(short s) calling like Short.valueOf(12) "+so);
		
		byte b11=22;
		Byte byee=Byte.valueOf(b11);
		
//		approach 3  using auto box mechanism we directly inject primitive value into wrapper class reference variable
		
		int ii=100;
		Integer in10=ii;
		System.out.println("changed primitive value of int to wrapper class Integer object using auto boxing mechanism means we directly inject primitive value into wrapper class reference variable ="+in10);
		
		
		

	}

}

package java8features;

import java.util.function.Predicate;


public class PredicatorDemo {

//	@Override
//	public boolean test(String t) {
//		// TODO Auto-generated method stub
//		return false;
//	}

//	@Override
//	public boolean test(String t) {
//		boolean boo= t.startsWith("c")?true:false;
//		return boo;
//	}
//	
	public static void main(String[] args) {
		
//		Predicate<String> predicate=new PredicatorDemo();
//		
//		boolean boo2=predicate.test("shenna");
//		
//		System.out.println(boo2);
//		
//	}
	Predicate<String> predicate=t->t.startsWith("c")?true:false;
	
	boolean boo=predicate.test("chenna");
	System.out.println(boo);

	
}
}
package javapractice;

public class YourBusinessClass {

	static Dependency1 dependency1;
	static Dependency2 dependency2;
	
	
	
	@Override
	public java.lang.String toString() {
		return "YourBusinessClass [dependency1=" + dependency1 + ", dependency2=" + dependency2 + "]";
	}



	public static void main(String[] args) {
		
		YourBusinessClass ybc=new YourBusinessClass ();
		
		dependency1=new Dependency1();
		dependency2=new Dependency2();
		System.out.println(dependency1);
		System.out.println(dependency2);
		System.out.println(ybc);
		
		
		
	}
	
	
	
}

package java8features;

public class AdditionTwo {

	public static void say() {
		System.out.println("Hai");
		
	}
	
	public static void main(String[] args) {
		
		Add add=AdditionTwo::say;
		add.addition();
		
	}

	
	
	
}

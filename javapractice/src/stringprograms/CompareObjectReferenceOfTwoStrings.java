package stringprograms;

public class CompareObjectReferenceOfTwoStrings {
public static void main(String[] args) {
	String firstName="chennakesava";
	String secondName="chennakesava";
	String thirdName=new String("chennakesava");
	
	if(firstName==secondName) {
		
		System.out.println("Two objects reference is same  "+firstName+"  "+secondName +" Here StringPooling is happen");
		
	}
	else {
		
		System.out.println("Two objects reference is not same ");
		
	}
	if(firstName==thirdName) {
		
		System.out.println("Two objects reference is same ");
		
	}
	else {
		
		System.out.println("two objects reference is not same ");
		System.out.println("Here String pooling is not happen because using new keyword new string"
				+ " object is created so we compare old object and new"
				+ " object the object refernce is differnt so ");
		
		
	}
	
	System.out.println(firstName);
	System.out.println(thirdName);
	System.out.println(secondName);
	
	
}
}

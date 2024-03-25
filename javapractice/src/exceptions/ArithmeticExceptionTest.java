package exceptions;

public class ArithmeticExceptionTest {
public static void main(String[] args) throws ArithmeticException {
	ArithmeticExceptionDemo ae=new ArithmeticExceptionDemo();
	int addition=ae.add(10, 20);
System.out.println(addition);
try {
int division=ae.division(20, 10);

System.out.println(division);
}
catch(Exception e) {
System.out.println(e.getMessage());	
}


}
}

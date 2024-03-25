package javaprograms2;

public class NumberReverse {
public static void main(String[] args) {
	
	int number=1234;
	int reverse=0;
	
while(number!=0) {
	
	reverse=number%10;
	
	
	number=number/10;
	System.out.print(reverse);
	
}

}
}

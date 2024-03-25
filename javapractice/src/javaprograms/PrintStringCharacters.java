package javaprograms;

public class PrintStringCharacters {
public static void main(String[] args) {
	String str="java is a most powerful language";
	
	System.out.println(str);
	
	for(int i=0; i<str.length();i++) {
		
		System.out.print(str.charAt(i));
		
	}
}
}

package javaprograms;

public class Duplicate {
public static void main(String[] args) {
	String str="tirutara";
	char[] ch=str.toCharArray();
	System.out.println("The duplicate values in "+ str);
	
	for(int i=0; i<ch.length;i++) {
		for(int j=i+1;j<ch.length;j++) {
			if(ch[i]==ch[j]) {
				System.out.println(ch[i]);
			}
			
		}
		
	}
}
}

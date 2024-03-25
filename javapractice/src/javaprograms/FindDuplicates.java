package javaprograms;

public class FindDuplicates {
public static void main(String[] args) {
	String str="channa";
	int length=str.length();
	System.out.println("length of string "+length);
	char[] characters =str.toCharArray();
	
	System.out.println(characters[0]);
	for(int i=0;i<characters.length;i++) {
		
		for(int j=i+1;j<characters.length;j++) {
			
			if(characters[i]==characters[j]) {
				
				System.out.println(characters[i]);
			}
		}
		
	}
	
	
	
}
}

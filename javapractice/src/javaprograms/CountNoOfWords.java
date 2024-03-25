package javaprograms;

public class CountNoOfWords {
public static void main(String[] args) {
	
	String str="welcome to naresh it";
	  int length=str.length();
	  System.out.println(length);
	  int count=1;
	  
	  for(int i=0; i<str.length()-1;i++) {
		  if( (str.charAt(i)==' ')&&(str.charAt(i+1)!=' ')) {
			  count++;
			  
		  }
		 
		  
	  }
	  System.out.println("number of words in a string  "+count);
	
}
}

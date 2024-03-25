package stringprograms;

public class StringIsPalindromeOrNot { 
	
	public void stringReverse(String originalString) {
		System.out.println(originalString);
		
		int k=originalString.length()-1;
		
		int j=originalString.length()-1;
		
		for( int i=0;i<=originalString.length()-1;i++) {
			
			if(originalString.charAt(i)==originalString.charAt(j)) {
				j--;
				
				if(i==k) {
					System.out.println("palindrome");
					
				}
			
			}
			
			else {
				
				System.out.println("not palindrome");
			}
			
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		StringIsPalindromeOrNot obj=new StringIsPalindromeOrNot();
		
		obj.stringReverse("lool");
		String originalName="madam";
		String reverseName="";
		
		for(int i=originalName.length()-1;i>=0;i--){
			reverseName+=originalName.charAt(i)
;			
		}
		if(originalName.equals(reverseName)) {
			
			System.out.println("string are palindr-ome ");
		}
		else {
			System.out.println(" strings are not palindrome ");
			
		}
		
		
		
		
	}
	
	
	
	

}

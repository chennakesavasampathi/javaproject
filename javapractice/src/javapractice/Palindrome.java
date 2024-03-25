package javapractice;

public class Palindrome {
	public static void main(String[] args) {
		String original = "madam";
		String reverse = "";
		System.out.println(original.length() - 1);
		System.out.println(reverse.length());
		for (int i = original.length() - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);

		}
		System.out.println(reverse);

	}
}

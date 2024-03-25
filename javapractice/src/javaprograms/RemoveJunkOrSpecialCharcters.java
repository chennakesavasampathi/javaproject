package javaprograms;

public class RemoveJunkOrSpecialCharcters {
public static void main(String[] args) {
	String str="java !@#$%^";
	str=str.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(str);
}
}

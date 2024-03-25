package java8features;

public class RemoveDulChars {
public static void main(String[] args) {
	String name="chennakesava";
	name.chars().distinct().forEach(c->System.out.print((char)c));
}
}

package com.hashcode.demo;

public class Test {

	
	
	public static void main(String[] args) {
		Human human1=new Human(102,"chenna");
		Human huma2=new Human(103,"chennakesava");
		Human huma3=new Human(104,"chennu");
		Human human4=new Human(102,"chenna");
		
		boolean value=human1.equals(human4);
		
		
		System.out.println(value);
		int hashcode=human1.hashCode();
		System.out.println("hashcode of an object human :"+hashcode);
		
		System.out.println(human1);
		System.out.println(human1.hashCode());
		System.out.println(human1.hashCode());
		System.out.println(human1.hashCode());
		System.out.println(human1.hashCode());
		System.out.println(human1.hashCode());
		System.out.println(huma2.hashCode());
		System.out.println(huma3.hashCode());
		System.out.println(human4.hashCode());
		
		
		String str="chenna";
		
		/*hashCode is same if the content of string object is same */
		String str1="chennakesava";
		String str2="chennakesava";
		
		
		System.out.println("we check the hashcode is same are mot ");
		String string1=new String("chenna");
		String string2=new String("chenna ");
		System.out.println(                 );
		System.out.println(                 );
		System.out.println(                 );
		System.out.println(                 );
		System.out.println(                 );
		System.out.println(                 );
		
		System.out.println(string1.hashCode());
		System.out.println(string2.hashCode());
		
		
		
		
		System.out.println("yes the hashcode is same when we create the string object using new keyword");
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		
		
		
		
		
	}
}

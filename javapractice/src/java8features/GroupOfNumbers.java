package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class GroupOfNumbers  {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<>();
	
	

	
	
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	list.add(6);
	list.add(7);
	
	
	Consumer<Integer> consumer=s->System.out.println(s);
	for(int i:list) {
		consumer.accept(i);
		
	}
	
	
	
//	list.stream().forEach(a->System.out.println(a));
	
//	for(int i:list) {
//		System.out.println(i);
//		
//	}
//	
	
	
}

public void accept(Integer t) {
System.out.println(t);	
}
}

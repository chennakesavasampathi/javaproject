package java8features;

import java.util.ArrayList;
import java.util.List;

public class ListOfElements {
public static void main(String[] args) {
	List<String> list=new ArrayList<>();
		list.add("chenna");
		list.add("shannu");
		list.add("chenna");
		
		list.stream().filter(s->s.startsWith("c")).forEach(k->System.out.println(k));
		
}
}

package java8realtimeproject2;

import java.util.ArrayList;
import java.util.List;

public class DaoLayer {
	
	public static List<Employee> getEmployees(){
		
		
		List<Employee> list=new ArrayList<>();
		
		list.add(new Employee(123,"chenna","it",700000));
		list.add(new Employee(223,"rhenna","it",400000));
		list.add(new Employee(523,"zhennakesava","it",600000));
		list.add(new Employee(323,"chenna","it",450000));
		list.add(new Employee(423,"ehenna","it",350000));
		return list;
		
		
	}

}

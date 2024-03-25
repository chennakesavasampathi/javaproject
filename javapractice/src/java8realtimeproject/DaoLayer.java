package java8realtimeproject;

import java.util.ArrayList;
import java.util.List;

public class DaoLayer {
	
	public static List<Employee> getEmployees(){
		
		
		List<Employee> list=new ArrayList<>();
		
		list.add(new Employee(123,"chenna","it",700000));
		list.add(new Employee(123,"shenna","it",400000));
		list.add(new Employee(123,"chennakesava","it",600000));
		list.add(new Employee(123,"chenna","it",450000));
		list.add(new Employee(123,"chenna","it",350000));
		return list;
		
		
	}

}

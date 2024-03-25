package java8features;

import java.util.ArrayList;
import java.util.List;

public class Employees {
	
	
	public List<Employee> employees(){
		
		List<Employee> emps=new ArrayList<Employee>();
		 emps.add(new Employee(10,"chennakesava","krp"));
		 emps.add(new Employee(20,"ramsai","pdk"));
		 emps.add(new Employee(30,"thirumala","guntur"));
		 emps.add(new Employee(40,"venkatrao","vnk"));
		 emps.add(new Employee(50,"siva prasad","bejawada"));
		 emps.add(new Employee(60,"venkatesh","reddypalem"));
		 
		return emps;
		
		
	}
	

}

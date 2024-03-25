package java8features;

import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class EmployeeService {

	public List<Employee> employeedata(){
Employees emp=new Employees();


List<Employee> em= emp.employees();

Collections.sort(em, new SortEmployeeData());

		return em;
		
		
	}
	public static void main(String[] args) {
		EmployeeService empee=new EmployeeService();
		
		System.out.println(empee.employeedata());
		
  
  
  
	}
	
	
	
	
	
}

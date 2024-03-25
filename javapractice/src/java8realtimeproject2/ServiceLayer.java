package java8realtimeproject2;

import java.util.Comparator;
import java.util.List;

public interface ServiceLayer {
	public static void main(String[] args) {
		
		
	List<Employee> emp=DaoLayer.getEmployees();
//	
//	Collections.sort(emp, new Comparator<Employee>() {
//
//		@Override
//		public int compare(Employee o1, Employee o2) {
//			return o1.getName().compareTo(o2.getName());
//		}});
//	System.out.println(emp);
//	
//	
		
//		
//		Collections.sort(emp, ((o1,o2)-> o1.getName().compareTo(o2.getName())));
//		System.out.println(emp);
	
	
	// using stream api
	
	
// using stream api pipeline methods to sort custom
//	objects fields based on employee id and baseds on employee game 
//	//Approach 1
	emp.stream().sorted(Comparator.comparing(Employee::getName).reversed()).forEach(System.out::println);
	System.out.println(emp);
//	
//	
//	//approach2
//	emp.stream().sorted((o1,o2)->-(o1.getName().compareTo(o2.getName()))).forEach(s->System.out.println(s));
//	System.out.println(emp);
////	
//	emp.stream().sorted(Comparator.comparing((employee->employee.getName()))).forEach(s->System.out.println(s));
//	
//	
	}}
		
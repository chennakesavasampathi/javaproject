package java8realtimeproject3;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import java8realtimeproject2.Employee;

public class DaoLayer {

	public static void main(String[] args) {

//		Map<Integer, String> map = new HashMap<>();
//		map.put(1, "shenan");
//		map.put(5, "chenan");
//		map.put(7, "zhenan");
//		map.put(2, "ahenan");
		
		

//		List<Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
//Collections.sort(list,new Comparator<Entry<Integer,String>>() {
//
//	@Override
//	public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
//		return o1.getKey()-o2.getKey();
//	}
//
//	
//	
//	
//	
//});
//		Collections.sort(list,(o1,o2)->-o1.getKey()-o2.getKey());
//System.out.println(list);
//	}

//		Collections.sort(list, (o1,o2)->-o1.getValue().compareTo(o2.getValue()));
//		
//		
//		System.out.println(list);
//		
////		
//
//		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
//		System.out.println("******************************************");
//		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
//		System.out.println(" sorting in reverse order ");
//
//		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
//
//		
		
		Map<Employee, Integer> map2 = new TreeMap<>();
		map2.put((new Employee(123, "chenna", "it", 700000)),20);
		map2.put((new Employee(223, "rhenna", "it", 400000)),30);
		map2.put((new Employee(523, "zhennakesava", "it", 600000)),40);
		map2.put((new Employee(323, "chenna", "it", 450000)),35);
		map2.put((new Employee(423, "ehenna", "it", 350000)),60);
		
//		map2.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary))).forEach(s->System.out.println(s));
		
		map2.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName))).forEach(System.out::println);
	}
}

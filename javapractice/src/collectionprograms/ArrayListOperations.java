package collectionprograms;

import java.util.ArrayList;

public class ArrayListOperations {
public static void main(String[] args) {
ArrayList<Object> arrayList=new ArrayList<>();// here arraylist allow all the object like 
//homegenious and heteogenious unique and duplicate

// Operation1 :i want to check arraylist is empty or not  so we are using isEmpty() method 
System.out.println(arrayList.isEmpty());
//Operation2: i want to check so we are using size() method 
System.out.println(arrayList.size());

//Operation 3: i want to print elements inside the arraylist
 System.out.println(arrayList);
 
// i want to add the element inside the arraylist
 
 arrayList.add("chenna");
 arrayList.add(100);
 
// how once again i want to check arraylist is empty or not and i want to knoe the size the array and one more is print the elemnts 
 System.out.println("after adding the element inside the arraylist ");
 System.out.println(arrayList.isEmpty());
 System.out.println(arrayList.size());
 System.out.println(arrayList);
 
 
//  i want to add multiple objects into the array
 arrayList.add(true);
 arrayList.add("thirumala");
 arrayList.add(12);
 arrayList.add(5.4);
 
// now i want to find the size of an arraylist and print the elemnets of array list
 
System.out.println();

System.out.println(arrayList);
System.out.println(arrayList.size());

System.out.println("arrayist elements is empty :"+arrayList.isEmpty());


arrayList.add(new Example(5,6));

System.out.println(arrayList);


//operation 4 i want to search element is present or not

System.out.println(arrayList.contains("chenna"));
System.out.println(arrayList.contains(new String("chenna")));// here equals method is overriden in string class so equals method comapare content and state 
System.out.println(arrayList.contains(new Example(5,6)));// contains method calls equal method in object using 
//using object compare all the elements  inside the arraylist based on reference wise so the references or not equal so we get false 





}
}

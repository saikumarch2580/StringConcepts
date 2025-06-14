package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class collections {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<String>() ;
		
		list.add("sairam");
		list.add("tam");
		list.add("rasi");
		list.add("sreya");
		list.add("Anu");
		list.add(1, "Rasmik");
		
		List<String> list1 = new ArrayList<String>() ;
			
		list1.add("Meenakshi");
		list1.add("kruthi");
		list1.add("sruthi");
		list1.addAll(2, list); 
		
		
			
System.out.println(list1.equals(list));
//FOR EACH LOOP
		
	/*	for(String s:list){
			
			System.out.println(s);
			
			
		}
		
		//for loop
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			 
	} 
		
		//ListIterator
		ListIterator MM = list.listIterator();
		
		System.out.println("Front side is");
		 
		while(MM.hasNext()) {
			System.out.println(MM.next());
		} 
		ListIterator MM = list.listIterator();
		
		System.out.println("Reverse side is");
		
		while(MM.hasPrevious()) {
			System.out.println(MM.previous());
		}*/
		
		//ADD index
		
		
		
		
}
}
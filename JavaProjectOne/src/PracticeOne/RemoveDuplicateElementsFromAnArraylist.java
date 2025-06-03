package PracticeOne;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElementsFromAnArraylist {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("sairam");
		list.add("krishna");
		list.add("sairam");
		list.add("mansi");
		
		for(String ch:list) {
			
			System.out.println(ch);
		}
		
		Set<String> set = new HashSet<>();
		
		set.addAll(list);
		
		System.out.println("The set values are :" + set);

	}
	
}

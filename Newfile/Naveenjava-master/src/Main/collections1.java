package Main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class collections1 {

	public static void main(String[] args) {
		
		List<String> lst = new ArrayList<>();
		lst.add("sairam");
		lst.add("Praveen");
		lst.add("karthikeyan");
		lst.add("Amarendra");
		lst.add(3, "sivasai");
		System.out.println(lst);

//	for(int i=0; i<lst.size(); i++) {
//			
//			System.out.println(lst.get(i));
//			
//
//             for(String M: lst) {
//             	
//            	System.out.println(M);
				
 //           }
		
	ListIterator<String> sr = lst.listIterator();
	while(sr.hasNext()){
	String totallist = sr.next();
	System.out.println(totallist);
		
	}
	}
	}


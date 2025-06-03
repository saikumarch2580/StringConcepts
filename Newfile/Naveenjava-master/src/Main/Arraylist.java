package Main;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList<Object> list = new ArrayList<>();
        list.add("Sairam");
        list.add(33);
        list.add(2.33);
        int h = list.size();
        for(Object s:list) {
        	
        	System.out.println(s);
        	System.out.println("total size is" + h);
        	
        }
        
        
        
	}
	
}

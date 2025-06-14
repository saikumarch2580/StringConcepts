package PracticeOne;

import java.util.HashMap;
import java.util.Map;

public class MaximumOccuranceOfAGivenString_Practice {

	public static void main(String[] args) {
		
		MaximumOccurance();
	}
		
		public static void MaximumOccurance() {
			
			
			String sr = "Sairam chintha";
			
			char[] str = sr.toCharArray();
			
			Map<String, Integer> map = new HashMap<>();
			
             for(int i=0; i<str.length; i++) {
            	 String key = String.valueOf(str[i]);
            	 if(map.containsKey(key)) {
            		
            		 map.put(key, map.get(key) +1);
            		 System.out.println("if conditions : " + map);
            	 } else {
            		 
            		 map.put(key, 1);
            		 System.out.println("else conditions : " + map);
            	 }
            	 
             }
			
             System.out.println(map);
					
		

	}

}

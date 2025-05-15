package Main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class maps {
	
	public static void main(String[] args) {
		
		HashMap mp = new HashMap();
		mp.put("Name", "sairam");
		mp.put("Dob", "30thsep1991");
		mp.put("Daughter", "Ritwika");
      System.out.println(mp);		
		
      for(int i=0; i<mp.size(); i++) {
    	  System.out.println(i);
      }

//      mp.remove("Name");
//      System.out.println(mp);
         Set s =  mp.keySet();
         System.out.println(s);
         Iterator itr = s.iterator();
         while(itr.hasNext()) {
        	 
        Object obj = itr.next();
      String md = (String)obj;
        	 System.out.println(md+"-"+mp.get(md));
         }
      
	}


		
	}

 	

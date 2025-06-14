package PracticeOne;

public class CountTheWordsInAString {

	public static void main(String[] args) {
		
		String str = "It is a good day ";
		
		 String[] split = str.split(" ");
		 
		 int count = 0;
		 
		 for(int i=0; i<split.length; i++) {
			 
			 count++;
			 
		 }
		 
		 System.out.println(count);

	}

}

package PracticeOne;

public class DuplicatesCharactersInAString {

	public static void main(String[] args) {
		DuplicatesCharacters();
		
	}
	public  static void DuplicatesCharacters() {
		
		String st = "I am working in Autorox";
		String temp ="";
		int count =0;
		
		int length = st.length();
		for(int i=0; i<length; i++) {
			boolean repeated = false;
			
			for(int j=1; j<i; j++) {
				if(st.charAt(i)==st.charAt(j)) {
					repeated = true; 
					count++;
				break;
				}
			}
			if(repeated) {
				temp = temp+st.charAt(i);
			}
			
			
		}
		System.out.println(temp);
		System.out.println("The total count is :"+ count);
	}
	
}

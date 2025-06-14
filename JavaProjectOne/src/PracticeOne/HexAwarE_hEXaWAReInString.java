package PracticeOne;

public class HexAwarE_hEXaWAReInString {

	public static void main(String[] args) {
	
		String str = "HexAwarE";
		String result = "";
		
		int lenght = str.length();
		
		char[] st = str.toCharArray();
		
		for(int i=0; i<lenght; i++) {
			
			char ch = st[i];
			
			if(Character.isUpperCase(ch)) {
				
				result = result+Character.toLowerCase(ch);
				
			}else {
				
				result = result+Character.toUpperCase(ch);
			}
				}
		System.out.println(result);
				
			}
		
		}

	



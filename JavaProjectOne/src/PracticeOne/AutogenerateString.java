package PracticeOne;

import java.util.Random;



	public class AutogenerateString {

	    public static void main(String[] args) {
	        Login();
	    }

	    public static String Login() {
	        String characters = "abcdefghijklmnopqrstuvwxyz";
	        int TotalLen = 5;
	        Random rand = new Random();
	        StringBuilder sb = new StringBuilder();

	        for (int i = 0; i < TotalLen; i++) {
	            int newrand = rand.nextInt(characters.length()); // Random index 0-25
	            System.out.println(newrand);

	            char newchar = characters.charAt(newrand);       // Safe character access
	            System.out.println(newchar);

	            sb.append(newchar);
	        }

	        return sb.toString();
	    }
	
			    
			

			

	}



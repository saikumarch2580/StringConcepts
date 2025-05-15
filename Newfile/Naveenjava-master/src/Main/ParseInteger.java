package Main;

public class ParseInteger {

	
		    public static void main(String[] args) {
		        // Sample string representing an integer
		        String numberString = "42";

		        try {
		            // Using Integer.parseInt to convert the string to an integer
		            int parsedNumber = Integer.parseInt(numberString);

		            // Display the result
		            System.out.println("Original String: " + numberString);
		            System.out.println("Parsed Integer: " + parsedNumber);
		        } catch (NumberFormatException e) {
		            // Handle the case where the string is not a valid integer
		            System.err.println("Error: Unable to parse the string as an integer.");
		            e.printStackTrace();
		        }
		    }
		


	}



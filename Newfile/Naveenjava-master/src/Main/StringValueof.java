package Main;

public class StringValueof {
	
	    public static void main(String[] args) {
	        // Example with integer
	        int value = 43;
	        String stringValue1 = String.valueOf(value);
	        System.out.println("String representation of int: " + stringValue1);

	        // Example with double
	        double doubleValue = 3.14;
	        String stringValue2 = String.valueOf(doubleValue);
	        System.out.println("String representation of double: " + stringValue2);

	        // Example with boolean 
	        boolean booleanValue = true;
	        String stringValue3 = String.valueOf(booleanValue);
	        System.out.println("String representation of boolean: " + stringValue3);

	        // Example with char
	        char charValue = 'A';
	        String stringValue4 = String.valueOf(charValue);
	        System.out.println("String representation of char: " + stringValue4);

	        // Example with object
	        Object objValue = new Object();
	        String stringValue5 = String.valueOf(objValue);
	        System.out.println("String representation of object: " + stringValue5);
	    }
	}




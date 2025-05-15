package com.String;

public class ReverseAstringWithSameSpaces {

	
	public static String reversePreserveSpaces(String input) {
        // Step 1: Convert input string to character array
        char[] inputArray = input.toCharArray();

        // Step 2: Create a new array for the result, same length as input
        char[] result = new char[inputArray.length];

        // Step 3: Store the positions of spaces in the result
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == ' ') {
                result[i] = ' '; // Keep space in the same position
            }
            System.out.println("The resule is : " + result[i] );
        }
        
        // Step 4: Start from the end and fill characters (excluding spaces)
        int j = inputArray.length - 1;

        for (int i = 0; i < inputArray.length; i++) {
            // Only process if it's not a space
            if (inputArray[i] != ' ') {
                // Move 'j' left until we find a non-space in result
                while (result[j] == ' ') {
                    j--;
                }

                result[j] = inputArray[i]; // Place the character
                j--; // Move left in result
            }
        }

        // Step 5: Convert result array back to a string and return
        return new String(result);
    }

    public static void main(String[] args) {
        String input = "a b c d";
        String output = reversePreserveSpaces(input);

        System.out.println("Input : \"" + input + "\"");
        System.out.println("Output: \"" + output + "\"");
    }

}

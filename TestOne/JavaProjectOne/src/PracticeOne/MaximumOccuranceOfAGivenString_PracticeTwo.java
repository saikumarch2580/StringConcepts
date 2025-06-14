package PracticeOne;

import java.util.Scanner;

public class MaximumOccuranceOfAGivenString_PracticeTwo {

public static void main(String[] args) {
        
        String str = "ritwika";  // 👈 You can change this to any input string

        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            boolean alreadyCounted = false;
            int count = 1;

            // Check if this character was already counted
            for (int j = 0; j < i; j++) {
                if (ch[i] == ch[j]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) {
                continue;
            }

            // Count occurrences of the character
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                }
            }

            System.out.println("Character: '" + ch[i] + "' occurs " + count + " time(s).");
        }
    }
}
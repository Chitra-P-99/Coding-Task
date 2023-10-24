package com.array.task;

import java.util.Scanner;
public class PangramChecker {
    public static void main(String[] args) {
    	Scanner ip=new Scanner(System.in); //user input
    	
        String sentence = ip.nextLine();
        boolean isPangram = isPangram(sentence);
        
        if (isPangram) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }

    public static boolean isPangram(String sentence) {
      
    	
        boolean[] alphabet = new boolean[26];

        //  case-insensitive check
        sentence = sentence.toLowerCase();

    
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c >= 'a' && c <= 'z') {
                alphabet[c - 'a'] = true;
            }
        }

        // Check if all alphabet characters are marked as present
        for (boolean isPresent : alphabet) {
            if (!isPresent) {
                return false;
            }
        }

        return true;
    }
}

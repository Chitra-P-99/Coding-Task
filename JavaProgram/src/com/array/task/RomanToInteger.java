package com.array.task;

import java.util.Scanner;
public class RomanToInteger {
    public static void main(String[] args) {
    	
    	Scanner ip=new Scanner(System.in); // user input
        String romanNumeral = ip.next(); 
        int result = romanToInt(romanNumeral);
        System.out.println("Integer representation: " + result);
    }

    public static int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar =s.charAt(i);
            String cr=currentChar+"";
            int currentValue = romanCharToInt(cr);

            // If the next character is larger, subtract the current value
            if (i < s.length() - 1) {
                char  nextChar = s.charAt(i + 1);
                String c=nextChar+"";
                int nextValue = romanCharToInt(c);

                if (currentValue < nextValue) {
                    result -= currentValue;
                } else {
                    result += currentValue;
                }
            } else {
                // Last character, simply add its value
                result += currentValue;
            }
        }

        return result;
    }

    public static int romanCharToInt(String  c) {
        switch (c) {
            case "I": return 1;
            case "IV":return 4;
            case "V": return 5;
            case "X": return 10;
            case "L": return 50;
            case "C": return 100;
            case "D": return 500;
            case "M": return 1000;
            default: return 0; // Invalid Roman numeral character
        }
    }
}



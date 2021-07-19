package org.tg.ppad.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberToString {

    public static void main(String[] args) throws IOException {
    	System.out.print("Enter number:");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(isr);
        String input = bfr.readLine();
        int number = 0;
        try {
            number = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println ( "Provide Valid Input");
            System.exit(1);
        }



    }

    public static String getWord(int i) {
        switch (i) {
        case 0:
                        return "zero";
        case 1:
                        return "a";
        case 2:
                        return "two";
        case 3:
                        return "three";
        case 4:
                        return "four";
        case 5:
                        return "five";
        case 6:
                        return "six";
        case 7:
                        return "seven";
        case 8:
                        return "eight";
        case 9:
                        return "nine";
        default:
            return "";
        }
    }

    public static String getPosition(int i) {
        switch (i) {
        case 0:
            return "";
        case 1:
                        return "ten";
        case 2:
                        return "hundred";
        case 3:
                        return "thousand";
        case 4:
                        return "Wan";
        case 5:
                        return "one hundred thousand";
        case 6:
                        return "million";
        case 7:
                        return "million";
        case 8:
                        return "one hundred million";
        case 9:
                        return "Billion";
        default:
            return "";
        }
    }
}
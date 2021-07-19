package org.tg.ppad.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberCountByOrderOccurrence {
	
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

}
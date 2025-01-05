package org.Learn;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any value:");
        System.out.println("User Entered using Scanner: \"" + sc.next() + "\"");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any value:");
        System.out.println("User Entered using BufferReader: \"" + br.readLine() + "\"");

        Console console = System.console();
        if (console == null) {
            System.out.println("No console available");
            return;
        }
        String name = console.readLine("Enter your name: ");
        System.out.println("Hello, " + name + "!");
    }
}

//Comparison Table
//Feature	                Scanner	                        BufferedReader	                Console
//Input Sources	            System.in, files, streams	    Character streams (via Reader)	System console only
//Parsing Support	        Yes (e.g., nextInt())	        No (manual parsing required)	No (manual parsing required)
//Performance	            Slower (parsing overhead)	    Faster (optimized for reading)	Faster for basic console I/O
//Ease of Use           	Easy (especially for tokens)	Moderate	                    Easy but limited
//Password Input	        No	                            No	                            Yes
//Environment	            Works in IDEs and consoles	    Works in IDEs and consoles	    Console only

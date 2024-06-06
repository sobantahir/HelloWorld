package com.soban;

import java.util.Scanner;

/**
 * @author Soban
 * date 06/06/2024
 * A java implementation of Hello World
 */

public class HelloWorld {
	
	/**
	 * Main method
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Get info from the user
		System.out.println("Please enter your name");
		String name = input.nextLine();
		System.out.println("Please enter a greeting");
		String greeting = input.nextLine();
		
		//Display the greeting
		String greetMessage = generateGreeting(greeting,name);
		System.out.println(greetMessage);
		
	}
	
	/**
	 * Creates a greeting using a custom greeting and name
	 * @param greeting What greeting to use
	 * @param name Who to greet
	 * @return The greeting
	 */
	public static String generateGreeting(String greeting, String name) {
		return greeting + ", " + name;
	}

}

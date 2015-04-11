
package com.mo;

import java.util.Scanner;

public class GitJenkins {

	public static void main(String[] args) {
		System.out.println("MO third TEst Git Jenkins build test");

		//primeTest();
		printPyramid();		
	}

	public static void printPyramid()
	{
		int pyramidValue = 5;
		
		for(int x =0; x < pyramidValue; x++)
		{
			for(int y = 0; y < (pyramidValue - x); y++)
			{
				System.out.print(" ");
			}
			
			for(int z = 0; z <= x; z++ )
			{	
				System.out.print("$ ");
			}
			
			System.out.println("");
		}
		
	}
	public static void primeTest()
	{
		int validInput = new GitJenkins().validateInput();
		if(validInput > 0)
		{
			System.out.println("Calculating and printing prime output...");			
			primeNumber(validInput);
		}
	}
	public static void primeNumber(int input) 
	{
		for(int x =2; x <= input; x++)
		{
			boolean isPrime = true;
			for(int y =2; y < x; y++)
			{
				if(x%y == 0)
				{
					isPrime = false;
					break;
				}								
			}
			
			if(isPrime)
			 System.out.println(x+" is a Prime Nubmer");	
				
		}
	}	
	public int validateInput()
	{
		String input= "";
		int result = -1;
		boolean quitFlag = false;
		while (!quitFlag) {
			Scanner in = new Scanner(System.in);
			System.out.println("Please enter a number to generate prime: ");
			
			while(in.hasNext())
			{	
				input = in.next();
                System.out.println("Value "+input +" Entered.");
                break;
			}	
			
			if (input.matches("\\d+")) {
				return Integer.parseInt(input);
			} else if (input.matches("quit")) {
				return -1;
			} else {
				System.out.println("Invalid user input: " + input);
			}

		}
		return result;
	}

}

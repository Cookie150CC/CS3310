package a1pack;

import java.io.*;

public class UserInterface {
	
	public static int getSize(){
		
		int input		= 0;
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("\nWell to search tester\n Please enter size of the 2d Array(size>2):\t");
		
		try{
			input = Integer.parseInt(kb.readLine().trim());
		}catch(Exception e){
			System.err.println("Enter a integer value greater than 2");
			return getSize();
		}
		
		if(input<2){
			System.err.println("Enter a integer value greater than 2");
			return getSize();
		}
		
		return input;
	}
	
	public static String getName(){
		
		String input 	= "a";
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("\nEnter your name:\t");
		
		try{
			input 		= kb.readLine().trim();
		}catch(Exception e){
			System.err.println("\nError with input try entering only char(a-z)");
			getName();
		}
		
		if(input.compareTo("")==0){
			System.err.println("\nError with input. Input has to be greater that \"\"");
			getName();
		}
		
		
		return input;
	}
}

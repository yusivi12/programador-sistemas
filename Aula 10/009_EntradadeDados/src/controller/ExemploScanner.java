package controller;

import java.util.Scanner;

public class ExemploScanner {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
																		// reads a whole line
		System.out.println("Enter your name:");
		String s1 = scan.nextLine();
		System.out.println("Your name is " + s1);
																		// reads only one word
		System.out.println("Cyti name:");
		String s2 = scan.next();
		System.out.println("City is " + s2);
		
		System.out.println("Enter whole number");
		int x = scan.nextInt();
		
		System.out.println("Enter double value:");
		double y = scan.nextDouble();
		
		System.out.println("Number are " + x + " and " + y + " and theri product is " + (x*y));
		
		scan.close();
		
		System.out.println("The End.");
	}

}

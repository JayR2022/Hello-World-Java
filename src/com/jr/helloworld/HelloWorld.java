package com.jr.helloworld;
import java.util.Scanner;
import com.jr.datatypes.DataTypes;
import java.util.Random;

public class HelloWorld {
	
	public static void main(String[] args) {
		
		String out_message = "Hello Jay!";
		Scanner myScannerObj = new Scanner(System.in);
		Random myRandom = new Random();
		
		System.out.println(DataTypes.returnString(out_message));
		System.out.println("Make a Selection - (b), (f), (c)");
		String mySelection = myScannerObj.nextLine();
		System.out.println("Jay Selected: " + mySelection);
		
		System.out.println(String.format("My Random number is: %d", myRandom.nextInt(100)));
		
		System.out.println(DataTypes.returnBoolean());
		System.out.println(DataTypes.returnMyFloat(534));
		System.out.println(DataTypes.returnMyChar2Int('s'));
		System.out.println("Hello World!");
	}

}



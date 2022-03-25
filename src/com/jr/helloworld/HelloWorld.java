package com.jr.helloworld;

public class HelloWorld {
	
	public static void printMessage(String message) {
		System.out.println(message);
	}
	
	public static String returnString(String message) {
		return message;
	}
	
	public static void main(String[] args) {
		String out_message = "Hello Jay!";
		System.out.println(returnString(out_message));
		printMessage("Hello World!");
	}
	

}

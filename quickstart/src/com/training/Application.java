package com.training;

public class Application {
	public static void main(String[]args) {
		Greeting grtobj = new Greeting();
		System.out.println(grtobj.getMessage());
		System.out.println(Greeting.getinfo());
		System.out.println(grtobj.getMessage());
		//System.out.println(grtobj.getinfo());
	}
}
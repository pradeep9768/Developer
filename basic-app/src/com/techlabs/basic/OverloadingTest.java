package com.techlabs.basic;

public class OverloadingTest {

	public static void main(String[] args) {
		printThis(true);
		printThis(10);
		printThis(10.5);
		
	}

	public static void printThis(double d) {
		System.out.println(d);
	}

	public static void printThis(boolean b) {
		System.out.println(b);

	}

	public static void printThis(char c) {
		System.out.println(c);
	}

	public static void printThis(int c) {
		System.out.println(c);

	}
}

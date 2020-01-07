package com.clover.practice;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your Percentage:");

		double studentPercentage=scanner.nextDouble();
		System.out.println(studentPercentage<35);
		
		
		if(studentPercentage>=35 && studentPercentage<40) {
			System.out.println("Congratulation...!!! You are Pass");
		}
		if(studentPercentage>=40 && studentPercentage<60) {
			System.out.println("second class");
		}
		if(studentPercentage>=60 && studentPercentage<=100) {
			System.out.println("first calss");
		}
		else {
			 
			System.out.println("You are Fail...!!! Try next time");
		}
		
		
		
		
	}

}

package com.web.java;

import java.util.Scanner;

public class CitizenChecker_1 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter your age: ");
	        int age = scanner.nextInt();

	        if (age > 60 && age < 80) {
	            System.out.println("You are a senior citizen.");
	        } else {
	            System.out.println("You are not a senior citizen.");
	        }

	        scanner.close();
	    }
}

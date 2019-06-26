package com.stackroute.pe1;

import java.io.IOException;
import java.util.Scanner;

//Palindrome Class
public class Palindrome {

//	Check whether the entered number is palindrome or not.
	public  String checkPalindrome(int num) {
	
//		variable declaration and initialization
		int rem, temp, rev = 0, sum = 0;

		temp = num;
		
//		Reverse a number and add even numbers in the number
		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			if (rem % 2 == 0) {
				sum = sum + rem;
			}
			temp /= 10;
		}
		
//		check for palindrome
		if (num == rev) {
		
//			check whether sum is greater than 25
			if (sum > 25) {
				return num + " is palindrome and sum of even numbers is greater than 25";
			} else {
				return num + " is palindrome and sum of even numbers is less than 25";
			}
		} else {
			return num + " is not a palindrome";
		}
	}
	
}

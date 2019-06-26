package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
	Palindrome palindrome = new Palindrome();
	
	@Test
	public void palindromeLessThan25(){

//		Act
		String result = palindrome.checkPalindrome(12321);
		System.out.println("Test1");

//		Assert
		assertEquals("12321 is palindrome and sum of even numbers is less than 25", result);
	}
	
	@Test
	public void palindromeGreaterThan25(){

//		Act
		String result = palindrome.checkPalindrome(678876);
		System.out.println("Test2");

//  	Assert
		assertEquals("678876 is palindrome and sum of even numbers is greater than 25", result);
	}
	
	@Test
	public void notPalindrome(){

//		Act
		String result = palindrome.checkPalindrome(30);
		System.out.println("Test3");

//  	Assert
		assertEquals("30 is not a palindrome", result);
	}
	
	
}
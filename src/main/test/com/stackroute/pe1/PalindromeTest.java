package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
	Palindrome palindrome;
	
	@Before
	public void setUp() throws Exception {
		palindrome = new Palindrome();
	}
	
	@After
	public void tearDown() throws Exception {
		palindrome = null;
	}
	
	@Test
	public void givenInputShouldReturnPalindromeAndSumOfNumberIsLessThan25(){

//		Act
		String result = palindrome.checkPalindrome(12321);

//		Assert
		assertEquals("12321 is palindrome and sum of even numbers is less than 25", result);
	}
	
	@Test
	public void givenInputShouldReturnPalindromeAndSumOfNumberIsGreaterThan25(){

//		Act
		String result = palindrome.checkPalindrome(678876);

//  	Assert
		assertEquals("678876 is palindrome and sum of even numbers is greater than 25", result);
	}
	
	@Test
	public void givenInputShouldReturnNotPalindrome(){

//		Act
		String result = palindrome.checkPalindrome(30);

//  	Assert
		assertEquals("30 is not a palindrome", result);
	}
	
	
}
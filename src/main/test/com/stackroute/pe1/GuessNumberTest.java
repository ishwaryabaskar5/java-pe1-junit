package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessNumberTest {
	
	GuessNumber guessNumber = new GuessNumber();
	
	@Before
	public void setUp()  {
	}
	
	@After
	public void tearDown()  {
	}
	
	@Test
	public void guessSmallerNumber(){

//		Act
		String result = guessNumber.guessNumber(5);
		System.out.println("Test1");

//		Assert
		assertEquals("OOPS!! GUESS AGAIN..Number guessed is less than original number", result);
	}
	
	@Test
	public void guessGreaterNumber(){

//		Act
		String result = guessNumber.guessNumber(47);
		System.out.println("Test2");

//  	Assert
		assertEquals("OOPS!! GUESS AGAIN..Number guessed is more than original number", result);
	}
	
	@Test
	public void guessCorrectNumber(){

//		Act
		String result = guessNumber.guessNumber(30);
		System.out.println("Test3");

//  	Assert
		assertEquals("HURRAY!!  YOU ARE CORRECT!!", result);
	}
}
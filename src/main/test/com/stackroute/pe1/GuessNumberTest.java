package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessNumberTest {
	
	GuessNumber guessNumber;
	
	@Before
	public void setUp()  {
		guessNumber = new GuessNumber();
	}
	
	@After
	public void tearDown()  {
		guessNumber = null;
	}
	
	@Test
	public void givenInputShouldReturnGuessedNumberIsLess(){

//		Act
		String result = guessNumber.guessNumber(5);

//		Assert
		assertEquals("OOPS!! GUESS AGAIN..Number guessed is less than original number", result);
	}
	
	@Test
	public void givenInputShouldReturnGuessedNumberIsGreater(){

//		Act
		String result = guessNumber.guessNumber(47);

//  	Assert
		assertEquals("OOPS!! GUESS AGAIN..Number guessed is more than original number", result);
	}
	
	@Test
	public void givenInputShouldReturnGuessedNumberIsCorrect(){

//		Act
		String result = guessNumber.guessNumber(30);

//  	Assert
		assertEquals("HURRAY!!  YOU ARE CORRECT!!", result);
	}
}
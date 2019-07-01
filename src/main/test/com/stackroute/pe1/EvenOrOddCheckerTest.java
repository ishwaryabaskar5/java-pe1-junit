package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOrOddCheckerTest {
	
	EvenOrOddChecker evenOrOddChecker;
	
	@Before
	public void setUp() {
		evenOrOddChecker = new EvenOrOddChecker();
	}
	
	@After
	public void tearDown() {
		evenOrOddChecker = null;
	}
	
	@Test
	public void givenInputShouldReturnTomForEvenNumber(){

//		Act
		String result = evenOrOddChecker.verifyEvenOrOdd(22);

//		Assert
		assertEquals("Tom", result);
	}
	
	@Test
	public void givenInputShouldReturnJerryForOddNumber(){

//		Act
		String result = evenOrOddChecker.verifyEvenOrOdd(27);

//  	Assert
		assertEquals("Jerry", result);
	}
	
	@Test
	public void givenInputShouldReturnErrorMessage(){

//		Act
		String result = evenOrOddChecker.verifyEvenOrOdd(5);

//  	Assert
		assertEquals("Neither Tom nor Jerry", result);
	}

}
package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest {
	
	StringReverse stringReverse;
	
	@Before
	public void setUp() {
		stringReverse = new StringReverse();
	}
	
	@After
	public void tearDown() {
		stringReverse = null;
	}
	
	@Test
	public void givenInputShouldReturnReversedString(){

//		Act
		String result = stringReverse.reverseString("hello world");

//		Assert
		assertEquals("dlrow olleh", result);
		
	}

	@Test
	public void givenInputShouldReturnEmptyString(){

//		Act
		String result = stringReverse.reverseString("");

//  	Assert
		assertEquals("", result);
	}

	@Test
	public void givenInputShouldReturnException(){

//		Act
		String result = stringReverse.reverseString(null);

//  	Assert
		assertEquals("Exception", result);
	}
}
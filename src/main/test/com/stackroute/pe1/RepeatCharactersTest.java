package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatCharactersTest {
	RepeatCharacters repeatCharacters;
	
	@Before
	public void setUp() {
		repeatCharacters = new RepeatCharacters();
	}
	
	@After
	public void tearDown() {
		repeatCharacters = null;
	}
	
	@Test
	public void givenInputShouldReturnRepeatedString(){

//		Act
		String result = repeatCharacters.repeatSubString("hello",3);

//		Assert
		assertEquals("TestPassed","hellollollollo", result);
	}
	
	@Test
	public void givenInputShouldReturnErrorMessage(){

//		Act
		String result = repeatCharacters.repeatSubString("hello",-2);

//  	Assert
		assertEquals("TestPassed","Error:Please enter a positive integer", result);
	}
	
}
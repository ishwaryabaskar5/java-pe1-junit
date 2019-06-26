package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatCharactersTest {
	RepeatCharacters repeatCharacters = new RepeatCharacters();
	
	@org.junit.Before
	public void setUp() throws Exception {
	}
	
	@org.junit.After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void repeatStringWhileGivingPositiveInteger(){

//		Act
		String result = repeatCharacters.repeatSubString("hello",3);
		System.out.println("Test1");

//		Assert
		assertEquals("TestPassed","hellollollollo", result);
	}
	
	@Test
	public void repeatStringWhileGivingNegativeInteger(){

//		Act
		String result = repeatCharacters.repeatSubString("hello",-2);
		System.out.println("Test2");

//  	Assert
		assertEquals("TestPassed","Error:Please enter a positive integer", result);
	}
	
}
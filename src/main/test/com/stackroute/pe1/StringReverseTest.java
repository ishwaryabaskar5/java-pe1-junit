package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest {
	
	StringReverse stringReverse = new StringReverse();
	
	@org.junit.Before
	public void setUp() throws Exception {
	}
	
	@org.junit.After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void reverseValidString(){

//		Act
		String result = stringReverse.reverseString("hello world");
		System.out.println("Test1");

//		Assert
		assertEquals("dlrow olleh", result);
	}

	@Test
	public void reverseEmptyString(){

//		Act
		String result = stringReverse.reverseString("");
		System.out.println("Test2");

//  	Assert
		assertEquals("", result);
	}

	@Test
	public void reverseNullString(){

//		Act
		String result = stringReverse.reverseString(null);
		System.out.println("Test3");

//  	Assert
		assertEquals("Exception", result);
	}
}
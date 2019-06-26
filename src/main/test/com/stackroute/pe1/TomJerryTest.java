package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class TomJerryTest {
	
	TomJerry tomJerryTest = new TomJerry();
	
	@Test
	public void isTom(){

//		Act
		String result = tomJerryTest.verifyTomOrJerry(22);
		System.out.println("Test1");

//		Assert
		assertEquals("Tom", result);
	}
	
	@Test
	public void isJerry(){

//		Act
		String result = tomJerryTest.verifyTomOrJerry(27);
		System.out.println("Test2");

//  	Assert
		assertEquals("Jerry", result);
	}
	
	@Test
	public void neitherTomNorJerry(){

//		Act
		String result = tomJerryTest.verifyTomOrJerry(5);
		System.out.println("Test3");

//  	Assert
		assertEquals("Neither Tom nor Jerry", result);
	}

}
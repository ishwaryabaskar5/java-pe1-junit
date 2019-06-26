package com.stackroute.pe1;

import static org.junit.Assert.*;
import org.junit.*;

public class CharacterIdentificationTest {
	
	CharacterIdentification characterIdentification = new CharacterIdentification();
	
	@Before
	public void setUp()  {
	}
	
	@After
	public void tearDown()  {
	}
	
	@Test
	public void identifySmallCases(){

//		Act
		String result = characterIdentification.identifyCharacter('a');
		System.out.println("Test1");
		
//		Assert
		assertEquals("Small case letter", result);
	}
	
	@Test
	public void identifyCapitalCases(){

//		Act
		String result = characterIdentification.identifyCharacter('A');
		System.out.println("Test2");

//  	Assert
		assertEquals("Capital letter", result);
	}
	
	@Test
	public void identifyDigits(){

//		Act
		String result = characterIdentification.identifyCharacter('4');
		System.out.println("Test3");

//  	Assert
		assertEquals("Digit", result);
	}
	
	@Test
	public void identifySymols(){

//		Act
		String result = characterIdentification.identifyCharacter('+');
		System.out.println("Test4");

//  	Assert
		assertEquals("Symbol", result);
	}
}







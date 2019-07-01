package com.stackroute.pe1;

import static org.junit.Assert.*;
import org.junit.*;

public class CharacterIdentificationTest {
	
	CharacterIdentification characterIdentification;
	
	@Before
	public void setUp()  {
		characterIdentification = new CharacterIdentification();
	}
	
	@After
	public void tearDown()  {
		characterIdentification = null;
	}
	
	@Test
	public void givenInputShouldReturnSmallCaseLetter(){

//		Act
		String result = characterIdentification.identifyCharacter('a');
		
//		Assert
		assertEquals("Small case letter", result);
	}
	
	@Test
	public void givenInputShouldReturnCapitalLetter(){

//		Act
		String result = characterIdentification.identifyCharacter('A');

//  	Assert
		assertEquals("Capital letter", result);
	}
	
	@Test
	public void givenInputShouldReturnDigit(){

//		Act
		String result = characterIdentification.identifyCharacter('4');

//  	Assert
		assertEquals("Digit", result);
	}
	
	@Test
	public void givenInputShouldReturnCapitalSymbol(){

//		Act
		String result = characterIdentification.identifyCharacter('+');

//  	Assert
		assertEquals("Symbol", result);
	}
}







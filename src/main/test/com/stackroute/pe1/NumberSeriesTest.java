package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberSeriesTest {
	
	NumberSeries numberSeries;
	
	@Before
	public void setUp() throws Exception {
		numberSeries = new NumberSeries();
	}
	
	@After
	public void tearDown() throws Exception {
		numberSeries = null;
	}
	
	@Test
	public void givenInputShouldReturnIntegerSeries(){

//		Act
		String result = numberSeries.generateSeries(3);

//		Assert
		assertEquals("122333", result);
	}
	
	@Test
	public void givenInputShouldReturnErrorMessage(){

//		Act
		String result = numberSeries.generateSeries(-5);

//  	Assert
		assertEquals("Please enter a positive integer", result);
	}
	
}
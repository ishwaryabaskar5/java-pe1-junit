package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberSeriesTest {
	
	NumberSeries numberSeries = new NumberSeries();
	
	@org.junit.Before
	public void setUp() throws Exception {
	}
	
	@org.junit.After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void generateSeriesForPositiveInteger(){

//		Act
		String result = numberSeries.generateSeries(3);
		System.out.println("Test1");

//		Assert
		assertEquals("122333", result);
	}
	
	@Test
	public void generateSeriesForNegativeInteger(){

//		Act
		String result = numberSeries.generateSeries(-5);
		System.out.println("Test2");

//  	Assert
		assertEquals("Please enter a positive integer", result);
	}
	
}
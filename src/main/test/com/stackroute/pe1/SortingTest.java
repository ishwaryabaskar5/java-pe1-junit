package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTest {
	
	Sorting sorting;
	
	@Before
	public void setUp() {
		sorting = new Sorting();
	}
	
	@After
	public void tearDown() {
		sorting = null;
	}
	
	@Test
	public void givenInputShouldReturnSortedNumber(){

//		Act
		int result = sorting.sort(73914);

//		Assert
		assertEquals("TestPassed",97431, result);
	}

	
	@Test
	public void givenInputShouldReturnSortrdIntegerWhichContainsZero(){

//		Act
		int result = sorting.sort(43024);

//  	Assert
		assertEquals("TestPassed",44320, result);
	}
}
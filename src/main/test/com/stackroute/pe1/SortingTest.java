package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTest {
	
	Sorting sorting = new Sorting();
	
	@Test
	public void sortPositiveInteger(){

//		Act
		int result = sorting.sort(73914);
		System.out.println("Test1");

//		Assert
		assertEquals("TestPassed",97431, result);
	}

	@Test
	public void sortNegativeInteger(){

//		Act
		int result = sorting.sort(-47292);
		System.out.println("Test2");

//  	Assert
		assertEquals("TestPassed","Error:Please enter a positive integer", result);
	}
	
	@Test
	public void sortPositiveIntegerWhichContainsZero(){

//		Act
		int result = sorting.sort(43024);
		System.out.println("Test3");

//  	Assert
		assertEquals("TestPassed",44200, result);
	}
}
package com.stackroute.pe1;

import java.util.Scanner;

public class Sorting {
	
	public int sort(int number) {

//		declaration and initialization
		int temp, counter = 0, sortedNumber = 0;
		int[] array= new int[20];
		
		
//		converts a number into array of numbers
			for (int i = 0; number != 0; number /= 10, i++) {
				array[i] = number % 10;
				counter =i;
			}

//		sort the array elements
			for (int j = 0; j <= counter-1 ; j++) {
				for (int k = j+1 ; k <= counter; k++) {
					if (array[j] < array[k]) {
						temp = array[j];
						array[j] = array[k];
						array[k] = temp;
					}
				}
			}
			
//		converts array into a number
			for (int i = 0; i <= counter; i++) {

					sortedNumber = (sortedNumber * 10) + (array[i]);
				
			}
			return sortedNumber;
		}
	}


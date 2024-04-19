/*
 * Write a Java program that takes a year from user and print whether that year is a leap 
year or not.
 */

package com.Assignment;

public class Program_3 
{
	public static void main(String[] args) 
	{
		int year=2000;
		if(year%4==0)
		{
			System.out.println(year+" your is leap year ");
		}
		else
		{
			System.out.println(year+" your is not a leap year ");
		}
		
	}

}

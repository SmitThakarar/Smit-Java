/*
 * Write a Java program that takes the user to provide a single character from the 
alphabet. Print Vowel or Consonant, depending on the user input. If the user input 
is not a letter (between a and z or A and Z), or is a string of length > 1, print an error 
message.
 */

package com.Assignment;

public class Program_2 
{
	public static void main(String[] args) 
	{
		char ch='b';
		if(ch=='a' || ch=='A' || ch=='e' || ch=='E'|| ch=='i' || ch=='I'|| ch=='o'||ch=='O'|| ch=='u'|| ch=='U' )
		{
			System.out.println("it is vowel "+ch);
		}
		else if(ch<=64 || ch>=123)
		{
			System.out.println("plz enter valid latters");
		}
		else
		{
			System.out.println("it is alphabet "+ch);
		}
		
	}

}

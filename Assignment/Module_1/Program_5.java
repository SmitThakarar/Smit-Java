/*
 * • Write a program in Java to input 5 numbers from keyboard and find their sum and 
average using for loop
 */

package com.Assignment;

import java.util.Scanner;

public class Program_5 
{
//	public static void main(String[] args) 
//	{
//		int i,n=0,a,sum;
//		for(i=1;i<=5;i++)
//		{
//			
//			sum=n+n;
//			a=sum/5;
//			System.out.println(a);
//			
//		}
//		
//	}

	public static void main(String[] args)
	{
		int sum=0;
		int avg=0;
		for(int i=1;i<=5;i++)
		{
			sum=sum+i;
			avg=sum/5;
			
		}
		System.out.println(sum);
		System.out.println(avg);
		

//       // Scanner input = new Scanner(System.in);
//		int num=0;
//        int sum = 0;
//        int avg = 0;
//        //System.out.println("Input the 5 numbers: ");
//        for(int i=1; i<=5; i++)
//        {
//            //int num = input.nextInt();
//            sum +=  num;
//
//        }
//        System.out.println("The sum of the given number is " + sum);
//        avg = sum/5;
//        System.out.println("The average of the given number is " + avg);

       
	}
}

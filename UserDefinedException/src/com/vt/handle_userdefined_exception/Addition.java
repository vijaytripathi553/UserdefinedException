package com.vt.handle_userdefined_exception;

import java.util.Scanner;

public class Addition {
	
	// Method which will perform addition
	public static int doAddition(int a, int b)
	{
		try
		{
			if(a==0 || b==0)
			{
				throw new ValueMustBeGraterThenZero();
				
			}
			
		}
		
		catch (ValueMustBeGraterThenZero e)
		{
			System.out.println("a and b must be grater then zero");
			
		}
		
		return a+b;
		
		
	}
	
	
	// Main Method
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1st No:");
		int a=sc.nextInt();
		
		System.out.println("Enter 2nd No:");
		int b=sc.nextInt();
		
		int ans=doAddition(a,b);  //fun. call
		System.out.println(ans);
		
		
		
	}

}

package com.main;

public class ExceptionEx {
	
	public static void divide(){
		
		int a = 10;
		int b = a/0;
		System.out.println("The number is :"+b);
		
	}

	public static void main (String[] args){
		
		// Exception handled when calling the function.
		try
		{
		ExceptionEx.divide();
		}
		catch(Exception e)
		{
			System.out.println("Exception occurred.");
			System.out.println("Exception handled while calling the funcion.");
		}
	}
}

package com.clairehumen;

import java.util.ArrayList;

public class ArrayAndListExamples {

	public static void main(String[] args)
	{
		forLoop();
		nestedForLoop();
		forEachLoop();
		whileLoop();
		doWhileLoop();
	}
	
	public static void forLoop()
	{
		for ( int i = 0 ; i <= 10 ; i++ )
		{
			System.out.println(i);
		}
	}
	
	public static void nestedForLoop()
	{
		for ( int i = 0 ; i <= 2 ; i++ )
		{
			for ( int j = 0 ; j<= 5 ; j++ )
			{
				System.out.println(i * j);
			}
		}
	}
	
	public static void forEachLoop()
	{
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("A");
		strings.add("B");
		strings.add("C");
		strings.add("D");
		
		for ( String s : strings )
		{
			System.out.println(s);
		}
		
	}
	
	public static void whileLoop()
	{
		int i = 0 ;
		while ( i <= 10 )
		{
			System.out.println(i) ;
			i = i + 1 ;
			// or ++ i;
			// or i += 1 ;
		}
	}
	
	public static void doWhileLoop()
	{
		int i = 0 ;
		do
		{
			System.out.println(i) ;
		}
		while ( i <= 10 );
	}
	
}

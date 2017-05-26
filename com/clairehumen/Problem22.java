package com.clairehumen;

import com.sun.corba.se.spi.orbutil.fsm.Input;

public class Problem22 {
	
	public static void main(String[] args)
	{
		String input = "computer";
		String output = "" ;
		for ( int k = 1 ; k < input.length() ; k = k + 2)
		{
			output += input.substring(k,k+1);
		}
		System.out.println(output);
	}

}

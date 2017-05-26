package com.clairehumen;

public class Problem21 {
	
	public static void main(String[] args)
	{
		int[] arr = new int[]{3,6,1,0,1,2};
		int x = 0 ;
		for ( int k = 0 ; k < arr.length ; k = k + 2 )
		{
			x = x + arr[k];
		}
		System.out.println(x);
	}

}

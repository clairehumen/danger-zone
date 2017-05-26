package com.clairehumen;

public class Problem20 {
	
	public static void main(String[] args)
	{
		int[] nums = new int[]{0,1,2,3,4};
		
		int j = 0 ;
		int k = nums.length - 1 ;
		
		while ( j < k )
		{
			int x = nums[j];
			nums[j] = nums[k] ;
			nums[k] = x ;
			j++ ;
			k--;
		}
		
		for ( int n : nums )
		{
			System.out.println(n);
		}

	}

}

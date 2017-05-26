package com.clairehumen;

public class IndexOfImplementation {

	public static void main(String[] args)
	{
		String searchString = "if I only had a brain" ;
		String findString = "rain" ;
		int posOf = indexOf(searchString, findString) ; 
		System.out.println(posOf);
	}
	
	public static int indexOf(String searchString, String findString)
	{
		char[] ssArr = searchString.toCharArray() ;
		char[] fsArr = findString.toCharArray();

		int cInt = 0 ; 
		for ( char c : ssArr )
		{
			if ( c == fsArr[0] )
			{
				boolean matches = true ;
				for ( int i = 1 ; i < fsArr.length ; i++ )
				{
					matches = matches ? ssArr[cInt + i] == fsArr[i] : matches ;
				}
				if ( matches )
				{
					return cInt ;
				}
			}
		    ++cInt ;	
		}
		
		return -1 ;
	}
	
}

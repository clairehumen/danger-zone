package crossword;

public class Crossword {
	
	private Square[][] puzzle ;
	
	public Crossword(boolean[][] blackSquares)
	{
		/*
		 * This is the height of the two dimensional array (how many rows)
		 */
		int height = blackSquares.length ;
		/*
		 * This is the width, and I guess we assume this is consistent for every row
		 */
		int width = blackSquares[0].length ;
		/*
		 * This just initializes the two dimensional array of squares given the dimensions
		 */
		this.puzzle = new Square[height][width];
		/*
		 * Start with row 0 and we will increment every time we advance a row
		 */
		int r = 0 ;
		/* 
		 * This is the current number of the square, which will be our running label
		 */
		int num = 0 ;
		/*
		 * Now we start walking through the rows, one array of 'squares' at a time.
		 */
		for ( boolean[] rowArray : blackSquares )
		{
			/* 
			 * Reset the column to zero
			 */
			int c = 0 ;
			/*
			 * Now we walk through the columns (we are going from left to right)
			 */
			for ( boolean squareValue : rowArray )
			{
				/*
				 * This is our default if the square is not labeled
				 */
				int squareNumber = 0 ;
				/* 
				 * This only happens if the square is labeled so we leverage the method we wrote below
				 */
				if ( toBeLabeled(r,c,blackSquares))
				{
					/* Increment the running number and set the value for the square */
					num = num + 1 ;
					squareNumber = num ;
				}
				/*
				 * Make a new square using the constructor and put it in the grid.
				 */
				this.puzzle[r][c] = new Square(squareValue,squareNumber);
				/*
				 * Next column.
				 */
				++c ;
			}
		}
		
	}
	
	private boolean toBeLabeled(int r, int c, boolean[][] blackSquares)
	{
		boolean isBlackSquare = blackSquares[r][c];
		
		/* 
		 * If this is a black square it cannot be labeled
		 */
		
		if ( isBlackSquare )
		{
			return false ;
		}
		
		/*
		 * At this point we know this is a white square. Any white square on the left edge
		 * (column 0) or the top row (row 0) must be labeled
		 */
		
		if ( r == 0 || c == 0 )
		{
			return true ;
		}
		
		/*
		 * Now we are safe to look to our left and above us and we will not run into the bounds of
		 * our array. Therefore ...
		 */
		
		if ( blackSquares[r-1][c] || blackSquares[r][c-1] )
		{
			return true ;
		}
		
		/*
		 * Not a numbered square. You could do this more succintly by just returning the condition in the 
		 * previous statement eg.
		 * 
		 * return ( blackSquares[r-1][c] || blackSquares[r][c-1] ) ;
		 */
		
		return false;
	}

}

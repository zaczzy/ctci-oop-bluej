package othello;

class Board {
	private int whiteScore;
	private int blackScore;
	private Piece[][] board;
	
	Board(int rows, int cols){
		board = new Piece[rows][cols];
	}
	void initialize() {
		/* initialize center black and white pieces */
	}

	/* attempt to place a piece of color at (row, column), 
	 * return true if successful*/
	boolean placeColor(int row, int column, Color color) {return true;}
	private int flipSection(int row, int column, Color color, Direction d) {
		return 0;
	}
	public int getScoreForColor(Color c) {
		if (c == Color.Black) return blackScore;
		return whiteScore;
	}
	/* update board with additional newPieces of newColor. 
	 * decrease score of opposite color*/
	void updateScore(Color newColor, int newPieces) {
		blackScore += newColor == Color.Black? newPieces : -newPieces;
		whiteScore += newColor == Color.White ? newPieces : -newPieces;
	}
}

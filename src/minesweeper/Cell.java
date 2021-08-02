package minesweeper;

class Cell {
	private int row;
	private int column;
	
	private boolean isBomb;
	private int number;
	
	private boolean isExposed = false;
	private boolean isGuess = false;
	
	Cell(int r, int c) {}
	
	/* Getters and setters of variables
	*/
	int getRow() {return row;}
	int getColumn() {return column;}
	boolean flip() {
		isExposed = true;
		return !isBomb;
	}
	
	boolean toggleGuess() {
		if (!isExposed) {
			isGuess = !isGuess;
		}
		return isGuess;
	}
	void setRowAndColumn(int r, int c) {
		row = r;
		column = c;
	}
	boolean isBlank() {return number == 0;}
}



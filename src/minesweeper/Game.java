package minesweeper;

class Game {
	enum GameState {WON, LOST, RUNNING};
	
	private Board board;
	private int rows;
	private int columns;
	private int bombs;
	private GameState state;
	
	boolean intialize() {return true;}
	boolean start() {return true;}
	boolean playGame() {return true;}

}

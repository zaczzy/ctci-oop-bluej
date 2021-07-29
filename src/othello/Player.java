package othello;

class Player {
	private Color color;
	Player(Color c) {color = c;}
	int getScore() {return 0;}
	boolean playPiece(int r, int c) {return true;}
	Color getColor() {return color;}
}

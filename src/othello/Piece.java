package othello;

class Piece {
	private Color color;
	Piece(Color c) {color = c;}
	Color getColor() {return color;}
	void flip() {
		if (color == Color.Black) color = Color.White;
		else color = Color.Black;
	}
	
}

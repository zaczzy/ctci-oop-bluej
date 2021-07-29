/**
 * 
 */
package jigsaw;

import jigsaw.edgetypes.Edge;

/**
 * @author zacha
 *
 */
class Board {

	class Side {
		private Edge[] edges;
		private int length;
	}
	private Side top;
	private Side down;
	private Side left;
	private Side right;
	private int size;
	private Piece[][] placed;
	
	Board(Side[] sides, int size) {
		this.top = sides[0];
		this.right = sides[1];
		this.down = sides[2];
		this.left = sides[3];
		top.length = size;
		right.length = size;
		down.length = size;
		left.length = size;
		this.size = size;
		placed = new Piece[size][size];
	}

}

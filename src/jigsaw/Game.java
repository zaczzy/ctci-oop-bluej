package jigsaw;

import java.util.LinkedList;

import javax.swing.text.Position;

class Game {
	private Board board;
	private LinkedList<Piece> pieces;
	private int N;
	
	Game() {
		pieces = new LinkedList<>();
//		define the pieces and add to pieces;
	}
	
	boolean solve() {
		return true;
		/*
		 * I think a proper solution requires a global queue of available pieces
		 * self-calling placeNextPiece function passing the 2d array of placed and
		 * pieces into the recursive function.
		 * Within placeNextPiece, given the position, 
		 * keep track of all pieces that fits the current position. Place one.
		 * If only one fits. return true.
		 * Recursively call self. 
		 * Returns true if self call returns true.
		 * Else remove the placed, place the next eligible one and call self again.
		 * Repeat this while available piece exists.
		 * If no available piece, return false.
		 */
		
		/*
		 * On second thought, we don't need recursive function, just go over each
		 * position. At each position keep track of the starting piece that we look at.
		 * Then iterate the pieces linkedlist for pieces. try to fit each.
		 * If something fits, remove it from linkedlist and place on board, move on to next position.
		 * If we have returned to starting piece, that means the state is invalid, so we return to the previous position. 
		 * Remove that piece and try the next piece. If the beginning position the state is still invalid, the game is unsolvable.
		 * If we have filled the last position, we won.
		 */
		
		/*
		 * The above solution should work when game unsolvable: when the number of
		 * correct pieces < N*M.
		 * Note: If missing pieces, we lose.
		 * If additional pieces is provided but correct pieces are there: we win.
		 * If replace a piece with wrong one, we lose.
		 */
	}
}

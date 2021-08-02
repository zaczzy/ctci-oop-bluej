package minesweeper;

import java.util.LinkedList;
import java.util.Queue;

class Board {
	private int nRows;
	private int nColumns;
	private int nBombs = 1;
	private Cell[][] cells;
	private Cell[] bombs;
	private int numUnexposedRemaining;
	Board(int r, int c, int b){}
	private void intializeBoard() {}
	private boolean flipCell(Cell cell) {return true;}
	void expandBlank(Cell cell) {
		int [][] deltas = {
				{-1, -1}, {-1, 0}, {-1, 1},
				{0, -1}, {0, 1},
				{1, -1}, {1, 0}, {1, -1}
		};
		Queue<Cell> toExplore = new LinkedList<>();
		toExplore.add(cell);
		while (!toExplore.isEmpty()) {
			Cell current = toExplore.remove();			
			for (int[] delta : deltas) {
				int r = current.getRow() + delta[0];
				int c = current.getColumn() + delta[1];
				Cell neighbor = cells[r][c];
				if (flipCell(neighbor) && neighbor.isBlank()) {
					toExplore.add(neighbor);
				}
			}
		}
	}
	int getNumRemaining() {return numUnexposedRemaining;}
}

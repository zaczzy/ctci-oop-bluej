package jigsaw;

enum Orientation {
	UP(0), RIGHT(1), DOWN(2), LEFT(3);
	private int value;
	Orientation(int val) {
		value = val;
	}
}

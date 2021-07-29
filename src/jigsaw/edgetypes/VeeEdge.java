package jigsaw.edgetypes;

public class VeeEdge extends Edge {

	@Override
	public boolean fitsWith(Edge other) {
		// TODO Auto-generated method stub
		return other.getClass() == WedgeEdge.class;
	}

}

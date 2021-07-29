/**
 * 
 */
package jigsaw.edgetypes;

/**
 * @author zacha
 *
 */
public class FlatEdge extends Edge {

	@Override
	public boolean fitsWith(Edge other) {
		return other.getClass() == FlatEdge.class;
	}

}

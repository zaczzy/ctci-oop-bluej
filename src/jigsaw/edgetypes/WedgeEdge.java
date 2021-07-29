/**
 * 
 */
package jigsaw.edgetypes;

/**
 * @author zacha
 *
 */
public class WedgeEdge extends Edge {

	@Override
	public boolean fitsWith(Edge other) {
		// TODO Auto-generated method stub
		return other.getClass() == VeeEdge.class;
	}

}

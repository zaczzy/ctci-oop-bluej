/**
 * 
 */
package circulararray;
import java.util.Iterator;

/**
 * @author zacha
 *
 */
// highlight here
public class CircularArray<T> implements Iterable<T> {
	private T[] items;
	private int head = 0;
	CircularArray(int size) {
//		highlight here
		items = (T[]) new Object[size];
	}
	private int convert(int index) {
//		highlight here
		if (index < 0) index += items.length;
		return (head + index) % items.length;
	}
	
	void rotate(int shiftRight) {
		head = convert(shiftRight);
	}
	
	void set(int index, T value) {
		items[convert(index)] = value;
	}
	
	T get(int index) {
//		highlight here
		if (index < 0 || index >= items.length)
			throw new java.lang.IndexOutOfBoundsException();
		T item = items[convert(index)];
		if (item.getClass() == Object.class) return null;
		return item;
	}
	@Override
	public Iterator<T> iterator() {
		// highlight here
		return new CircularArrayIterator<T>(this);
	}
	
//	highlight here
	private class CircularArrayIterator<TI> implements Iterator<TI> {
		private int _current = -1;
		private TI[] _items;
		CircularArrayIterator(CircularArray<TI> arr){
			_items = arr.items;
			
		}
		@Override
		public boolean hasNext() {
			return _current < _items.length - 1;
		}

		@Override
		public TI next() {
			// highlight here
			_current++;
			TI item = _items[convert(_current)];
			return item;
		}
		@Override
		public void remove() {
			throw new java.lang.UnsupportedOperationException("remove not supported");
		}
	}
	
}

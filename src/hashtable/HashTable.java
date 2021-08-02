package hashtable;
import java.util.ArrayList;
class HashTable<K, V> {
	private static class LinkedListNode<K, V> {
		private LinkedListNode<K,V> next;
		private LinkedListNode<K,V> prev;
		private K key;
		private V value;
		
		LinkedListNode(K key, V value) {
			next = null;
			prev = null;
			this.key = key;
			this.value = value;
		}
		
		void setPrev(LinkedListNode<K, V> p) {prev = p;}
		void setNext(LinkedListNode<K, V> n) {next = n;}
		
		LinkedListNode<K, V> getNext(){return next;}
		LinkedListNode<K, V> getPrev(){return prev;}
		K getKey() {return key;}
		V getValue() {return value;}
	}	
	private ArrayList<LinkedListNode<K, V>> items;
	HashTable(int capacity) {
		items = new ArrayList<>();
		items.ensureCapacity(capacity);
		for (int i = 0; i < capacity; i++) {
			items.add(null);
		}
	}
	
	void put(K key, V value) {
//		if same key exists, update value
//		else
//		put in the head of linkedlist
	}
	
	V get(K key) {
		LinkedListNode<K, V> node = getLinkedListNode(key);
		return node == null? null : node.getValue();
	}
	
	private LinkedListNode<K, V> getLinkedListNode(K key){
		LinkedListNode<K, V> current = items.get(getIndex(key));
		while (current != null) {
			if (current.getKey() == key) break;
			current = current.getNext();
		}
		return current;
	}
	int getIndex(K key) {
		return Math.abs(key.hashCode()) % items.size();
	}
}

package filesystem;
import java.util.ArrayList;
class Directory extends Entry {
	protected ArrayList<Entry> contents;
	Directory(String n, Directory p) {
		super(n, p);
		contents = new ArrayList<>();
	}

	boolean deleteEntry(Entry e) {return contents.remove(e);}
	int size() {
		int size = 0;
		for (Entry e : contents) {
			size += e.size();
		}
		return size;
	}
}

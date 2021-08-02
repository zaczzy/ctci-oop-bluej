package filesystem;

class File extends Entry {
	private int size;
	private String content;
	File(String n, Directory p, int sz) {
		super(n, p);
		size=sz;
	}

	@Override
	int size() {
		return size;
	}
	
	String getContents() {return content;}
	void setContents(String c) {content = c;}
}

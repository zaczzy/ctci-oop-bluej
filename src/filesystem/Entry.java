package filesystem;

abstract class Entry {
	protected Directory parent;
	protected long created;
	protected long lastUpdated;
	protected long lastAccessed;
	protected String name;
	
	Entry(String n, Directory p) {
		created = System.currentTimeMillis();
		lastUpdated = created;
		lastAccessed = created;
		name = n;
		parent = p;
	}
	
	boolean delete() {
		if (parent == null) return false;
		return parent.deleteEntry(this);
	}
	abstract int size();
	
	String getFullPath() {
		if (parent == null) return name;
		return parent.getFullPath() + "/" + name;
	}
	long getCreationTime() {return created;}
	long getLastUpdatedTime() {return lastUpdated;}
	long getLastAccessedTime() {return lastAccessed;}
	
	void changeName(String n) {name = n;}
	String getName() {return name;}
}

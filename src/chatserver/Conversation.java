package chatserver;

import java.util.ArrayList;

abstract class Conversation {
	protected ArrayList<User> participants;
	protected int id;
	protected ArrayList<Message> messages;
	
	ArrayList<Message> getMessages() {return messages;}
	boolean addMessage(Message m) {messages.add(m); return true;}
	int getId() {return id;}
}

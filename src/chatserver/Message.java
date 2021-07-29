package chatserver;

import java.util.Date;

class Message {
	private String content;
	private Date date;
	private User src;
	Message(String content, User src){
		this.content = content;
		this.src = src;
		date = new Date();
	}
	
	String getContent() {return content;}
	Date getDate() {return date;}
	User getSrc() {return src;}
}

package chatserver;
import java.util.ArrayList;
import java.util.HashMap;
abstract class User {
	/* Adding contacts:
	 * A calls requestAddUser(User B)
	 * the method calls UserManager.addUser
	 * that method calls User A.sentAddRequest and User B.receivedAddRequest
	 * B responds and each response function calls UserManager.addUserResolve
	 * */
	private int id;
	private UserStatus status = null;
	
	private HashMap<Integer, PrivateChat> privateChats;
	private ArrayList<GroupChat> groupChats;
	
	private HashMap<Integer, AddRequest> receivedAddRequests;
	private HashMap<Integer, AddRequest> sentAddRequests;
	private HashMap<Integer, User> Contacts;
	
	private String accountName;
	private String fullName;
	
	User(int id, String accountName, String fullName){}
	abstract boolean sendMessageToUser(User to, String content);
	abstract boolean sendMessageToGroup(int id, String content);
	abstract void setStatus(UserStatus status);
	abstract UserStatus getStatus();
	abstract boolean addContact(User user);
	abstract void receivedAddRequest(AddRequest req);
	abstract void sentAddRequest(AddRequest req);
	abstract void removeAddRequest(AddRequest req);
	abstract void sentAddRequestRejected(AddRequest req);
	abstract void requestAddUser(String accountName);
	
	abstract void addConversation(int id, PrivateChat chat);
	abstract void addConversation(GroupChat chat);
	abstract void addAccountName(String name);
	abstract String getAccountName();
	abstract int getId();
	
	
}

package chatserver;
import java.util.HashMap;
class UserManager {
	private static UserManager instance;
	private HashMap<Integer, User> usersById;
	static UserManager getInstance() {
		if (instance == null) instance = new UserManager();
		return instance;
	}
}

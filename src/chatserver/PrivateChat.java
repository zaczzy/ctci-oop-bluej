package chatserver;

import java.util.ArrayList;
import java.util.Arrays;

class PrivateChat extends Conversation {
	PrivateChat(User user1, User user2) {
		this.participants = new ArrayList<>(Arrays.asList(user1, user2));
	}
	User getOtherParticipant(User user) {
		if (user.getId() == participants.get(0).getId()) return participants.get(1);
		if (user.getId() == participants.get(1).getId()) return participants.get(0);
		return null;
	}
}

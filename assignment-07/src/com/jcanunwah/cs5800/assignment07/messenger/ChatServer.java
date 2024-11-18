package com.jcanunwah.cs5800.assignment07.messenger;

import java.util.HashMap;

public class ChatServer
{
	private HashMap<String, User> users;

	public ChatServer() {
		this.users = new HashMap<>();
	}

	public User registerUser(String username) {
		User newUser = new User(username, this);

		this.users.put(username, newUser);

		return newUser;
	}

	protected void sendMessage(Message message) {
		for (User recipient : message.getRecipients()) {
			if (!recipient.isUserBlocked(message.getSender())) {
				recipient.receiveMessage(message);
			}
		}
	}

	protected void undoMessage(Message message) {
		for (User recipient : message.getRecipients()) {
			recipient.removeLastMessage(message);
		}
	}

	protected void unregisterUser(User user) {
		this.users.remove(user.getUsername());
	}
}

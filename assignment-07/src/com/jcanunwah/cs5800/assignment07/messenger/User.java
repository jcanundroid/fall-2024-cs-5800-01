package com.jcanunwah.cs5800.assignment07.messenger;

import java.util.ArrayList;
import java.util.Iterator;

public class User implements IterableByUser
{
	private String username;
	private ChatServer server;
	private ChatHistory history;
	private MessageMemento memento;
	private ArrayList<User> blockedUsers;

	protected User(String username, ChatServer server) {
		this.username = username;
		this.server = server;
		this.history = new ChatHistory();
		this.memento = new MessageMemento();
		this.blockedUsers = new ArrayList<>();
	}

	public String getUsername() {
		return this.username;
	}

	public void blockUser(User user) {
		this.blockedUsers.add(user);
	}

	public boolean isUserBlocked(User user) {
		for (User blockedUser : this.blockedUsers) {
			if (blockedUser.getUsername() == user.getUsername()) {
				return true;
			}
		}

		return false;
	}

	public void sendMessage(User[] recipients, String content) {
		Message message = new Message(this, recipients, content);

		this.memento.setState(message);
		this.history.addMessage(message);
		this.server.sendMessage(message);
	}

	protected void receiveMessage(Message message) {
		this.history.addMessage(message);
	}

	public boolean undoLastMessageSent() {
		Message message = this.memento.getState();

		if (message == null) {
			return false;
		}

		this.memento.clearState();

		this.removeLastMessage(message);
		this.server.undoMessage(message);

		return true;
	}

	protected void removeLastMessage(Message message) {
		this.history.removeMessageBySender(message);
	}

	public Iterator iterator(User user) {
		return this.history.iterator(user);
	}

	public void unregister() {
		this.server.unregisterUser(this);
	}
}

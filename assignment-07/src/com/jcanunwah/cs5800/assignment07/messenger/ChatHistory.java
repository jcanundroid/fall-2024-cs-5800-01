package com.jcanunwah.cs5800.assignment07.messenger;

import java.util.ArrayList;
import java.util.Iterator;

public class ChatHistory
{
	private ArrayList<Message> messages;

	protected ChatHistory() {
		this.messages = new ArrayList<>();
	}

	protected void addMessage(Message message) {
		this.messages.add(message);
	}

	protected Message getLastMessage() {
		int last = this.messages.size() - 1;

		if (last < 0) {
			return null;
		}

		return this.messages.get(last);
	}

	protected void removeMessageBySender(Message message) {
		for (int i = this.messages.size() - 1; i >= 0; i--) {
			 if (this.messages.get(i).getSender().getUsername() == message.getSender().getUsername()) {
			 	this.messages.remove(i);
			 }
		}
	}

	protected Iterator iterator(User user) {
		return new ChatHistoryWithUserIterator(user, this.messages);
	}
}

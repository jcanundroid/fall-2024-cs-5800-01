package com.jcanunwah.cs5800.assignment07.messenger;

import java.util.ArrayList;
import java.util.Iterator;

public class ChatHistoryWithUserIterator implements Iterator
{
	private User user;
	private ArrayList<Message> messages;
	private int index;
	private int count;

	protected ChatHistoryWithUserIterator(User user, ArrayList<Message> messages) {
		this.user = user;
		this.messages = messages;
		this.index = 0;
		this.count = this.messages.size();
	}

	public boolean hasNext() {
		while (this.index < this.count) {
			User sender = this.messages.get(index).getSender();

			if (sender.getUsername() == this.user.getUsername()) {
				return true;
			}

			this.index++;
		}

		return false;
	}

	public Message next() {
		if (this.hasNext()) {
			return this.messages.get(this.index++);
		}

		return null;
	}
}

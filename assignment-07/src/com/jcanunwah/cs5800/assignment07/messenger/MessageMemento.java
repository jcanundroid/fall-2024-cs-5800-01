package com.jcanunwah.cs5800.assignment07.messenger;

public class MessageMemento
{
	private Message message;

	protected MessageMemento() {
		this.message = null;
	}

	public void setState(Message message) {
		this.message = message;
	}

	public void clearState() {
		this.message = null;
	}

	public Message getState() {
		return this.message;
	}
}

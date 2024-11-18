package com.jcanunwah.cs5800.assignment07.messenger;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Message
{
	private static SimpleDateFormat dateFormatter;

	private User sender;
	private User recipients[];
	private Date timestamp;
	private String content;

	static {
		dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	}

	protected Message(User sender, User[] recipients, String content) {
		this.sender = sender;
		this.recipients = recipients;
		this.timestamp = new Date(System.nanoTime() / 1000000);
		this.content = content;
	}

	protected User getSender() {
		return this.sender;
	}

	protected User[] getRecipients() {
		return this.recipients;
	}

	protected Date getTimestamp() {
		return this.timestamp;
	}

	protected String getContent() {
		return this.content;
	}

	public String toString() {
		return "[" + this.dateFormatter.format(this.timestamp) + " " + this.sender.getUsername() + "] " + this.content;
	}
}

package com.jcanunwah.cs5800.assignment07.tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import com.jcanunwah.cs5800.assignment07.messenger.*;

public class UserTest
{
	@Test
	@DisplayName("block user")
	public void testBlockUser() {
		ChatServer server = new ChatServer();

		User user1 = server.registerUser("user1");
		User user2 = server.registerUser("user2");

		Assert.assertEquals(false, user1.isUserBlocked(user2));

		user1.blockUser(user2);

		Assert.assertEquals(true, user1.isUserBlocked(user2));
	}

	@Test
	@DisplayName("undo last message")
	public void testUndoLastMessage() {
		ChatServer server = new ChatServer();

		User user1 = server.registerUser("user1");
		User user2 = server.registerUser("user2");

		Assert.assertEquals(false, user1.undoLastMessageSent());

		user1.sendMessage(new User[] { user2 }, "Hello, World!");

		Assert.assertEquals(true, user1.undoLastMessageSent());
	}
}

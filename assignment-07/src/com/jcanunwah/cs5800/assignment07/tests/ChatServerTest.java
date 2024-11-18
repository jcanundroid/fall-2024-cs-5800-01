package com.jcanunwah.cs5800.assignment07.tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import com.jcanunwah.cs5800.assignment07.messenger.*;

public class ChatServerTest
{
	@Test
	@DisplayName("register user -> correct username")
	public void testRegisterUserGivesCorrectUsername() {
		ChatServer server = new ChatServer();

		String username = "username";
		User user = server.registerUser(username);

		Assert.assertEquals(username, user.getUsername());
	}
}

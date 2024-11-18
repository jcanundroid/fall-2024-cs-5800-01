package com.jcanunwah.cs5800.assignment07;

import java.util.Iterator;

import com.jcanunwah.cs5800.assignment07.messenger.*;

public class Main
{
	public static void main(String[] args) {
		ChatServer server = new ChatServer();

		User sydney = server.registerUser("sydney");
		User mike = server.registerUser("mike");
		User rick = server.registerUser("rick");

		mike.sendMessage(new User[] { sydney }, "Hey Harp!");
		mike.sendMessage(new User[] { sydney }, "Wanna go fishing?");
		mike.sendMessage(new User[] { sydney }, "^ for some carp?");

		sydney.sendMessage(new User[] { mike }, "I'm busy");

		rick.sendMessage(new User[] { sydney, mike }, "Welcome to my house!");
		rick.undoLastMessageSent();
		rick.sendMessage(new User[] { sydney, mike }, "Welcome to the house!");
		rick.sendMessage(new User[] { sydney, mike }, "Are you two married?");

		sydney.blockUser(rick);

		rick.sendMessage(new User[] { sydney, mike }, "You two argue like it");

		printMessages(sydney, mike);
		printMessages(mike, sydney);
		printMessages(sydney, rick);
		printMessages(mike, rick);
	}

	private static void printMessages(User user, User fromUser) {
		Iterator iterator = user.iterator(fromUser);

		System.out.println("\n" + user.getUsername() + " messages from " + fromUser.getUsername() + ":\n");

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}

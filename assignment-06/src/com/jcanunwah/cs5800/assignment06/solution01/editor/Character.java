package com.jcanunwah.cs5800.assignment06.solution01.editor;

public class Character
{
	private char character;
	private CharacterProperty[] properties;

	public Character(char character, CharacterProperty[] properties) {
		this.character = character;
		this.properties = properties;
	}

	public char getCharacter() {
		return this.character;
	}

	public CharacterProperty[] getProperties() {
		return this.properties;
	}
}

package com.jcanunwah.cs5800.assignment06.solution01.editor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Document
{
	private static CharacterPropertyFactory characterPropertyFactory;

	private String filename;
	private ArrayList<Character> content;

	static {
		characterPropertyFactory = new CharacterPropertyFactory();
	}

	public Document(String filename) {
		this.filename = filename;
		this.content = new ArrayList<Character>();
	}

	public CharacterPropertyFactory getCharacterPropertyFactory() {
		return this.characterPropertyFactory;
	}

	public String getFilename() {
		return this.filename;
	}

	public void write(String text, CharacterProperty[] properties) {
		for (int i = 0; i < text.length(); ++i) {
			this.content.add(new Character(text.charAt(i), properties));
		}
	}

	public boolean load() {
		this.content.clear();

		try {
			BufferedReader reader = new BufferedReader(new FileReader(this.filename));

			for (String line; (line = reader.readLine()) != null;) {
				char character = line.charAt(0);
				ArrayList<CharacterProperty> properties = new ArrayList<>();

				if (line.length() > 2) {
					String[] propertiesList = line.substring(2).split(" ");

					for (String property : propertiesList) {
						String[] parts = property.split("=");

						properties.add(this.characterPropertyFactory.getProperty(parts[0], parts[1]));
					}
				}

				this.content.add(new Character(character, properties.toArray(new CharacterProperty[properties.size()])));
			}
		}
		catch (Exception e) {
			System.out.println(e);
			return false;
		}

		return true;
	}

	public boolean save() {
		try {
			PrintWriter writer = new PrintWriter(this.filename);

			writer.print(this.toString());
			writer.flush();
			writer.close();
		}
		catch (Exception e) {
			return false;
		}

		return true;
	}

	public String toString() {
		String result = "";

		for (Character c : this.content) {
			result += c.getCharacter();

			for (CharacterProperty property : c.getProperties()) {
				result += " " + property.getType() + "=" + property.getValue();
			}

			result += "\n";
		}

		return result;
	}
}

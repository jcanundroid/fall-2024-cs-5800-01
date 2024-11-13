package com.jcanunwah.cs5800.assignment06.solution01;

import com.jcanunwah.cs5800.assignment06.solution01.editor.*;

public class Main
{
	public static void main(String[] args) {
		Document document = new Document("test.txt");
		CharacterPropertyFactory factory = document.getCharacterPropertyFactory();

		CharacterProperty[] noProperties = new CharacterProperty[] {};

		CharacterProperty[] arialRed12 = new CharacterProperty[] {
			factory.getProperty("font", "Arial"),
			factory.getProperty("color", "Red"),
			factory.getProperty("size", "12")
		};

		CharacterProperty[] calibriBlue14 = new CharacterProperty[] {
			factory.getProperty("font", "Calibri"),
			factory.getProperty("color", "Blue"),
			factory.getProperty("size", "14")
		};

		CharacterProperty[] verdanaBlack16 = new CharacterProperty[] {
			factory.getProperty("font", "Verdana"),
			factory.getProperty("color", "Black"),
			factory.getProperty("size", "16")
		};

		document.write("Hello", noProperties);
		document.write("World", arialRed12);
		document.write("CS", calibriBlue14);
		document.write("5800", verdanaBlack16);

		System.out.println("Document contents written to '" + document.getFilename() + "':\n");
		System.out.println(document);

		document.save();

		Document document2 = new Document("test.txt");

		document2.load();

		System.out.println("Document contents read from '" + document2.getFilename() + "':\n");
		System.out.println(document2);
	}
}

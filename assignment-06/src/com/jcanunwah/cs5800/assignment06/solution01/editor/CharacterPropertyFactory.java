package com.jcanunwah.cs5800.assignment06.solution01.editor;

import java.util.HashMap;

public class CharacterPropertyFactory
{
	private HashMap<String, CharacterProperty> properties;

	public CharacterPropertyFactory() {
		this.properties = new HashMap<>();
	}

	public CharacterProperty getProperty(String type, String value) {
		String key = type + "." + value;

		if (this.properties.containsKey(key)) {
			return properties.get(key);
		}

		CharacterProperty property = null;

		switch (key) {
			case "font.Arial":
				property = new FontArial();
				break;

			case "font.Calibri":
				property = new FontCalibri();
				break;

			case "font.Verdana":
				property = new FontVerdana();
				break;

			case "color.Red":
				property = new ColorRed();
				break;

			case "color.Blue":
				property = new ColorBlue();
				break;

			case "color.Black":
				property = new ColorBlack();
				break;

			case "size.12":
				property = new Size12();
				break;

			case "size.14":
				property = new Size14();
				break;

			case "size.16":
				property = new Size16();
				break;
		}

		if (property != null) {
			this.properties.put(key, property);
		}

		return property;
	}
}

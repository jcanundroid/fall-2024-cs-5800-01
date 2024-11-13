package com.jcanunwah.cs5800.assignment06.solution01.tests;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import com.jcanunwah.cs5800.assignment06.solution01.editor.*;

public class DocumentTest
{
	@Test
	@DisplayName("write character -> toString outputs character")
	public void testWriteCharacterToStringOutputsCharacter() {
		Document document = new Document("");

		document.write("A", new CharacterProperty[] {
			document.getCharacterPropertyFactory().getProperty("font", "Arial")
		});

		String correctOutput = "A font=Arial\n";

		Assert.assertEquals(correctOutput, document.toString());
	}

	@Test
	@DisplayName("loaded test file -> toString output correct")
	public void testLoad() {
		try {
			PrintWriter writer = new PrintWriter("testLoad.txt");
			Document document = new Document("testLoad.txt");

			String correctOutput = "A font=Arial";

			writer.println(correctOutput);
			writer.flush();
			writer.close();

			document.load();

			Assert.assertEquals(correctOutput + "\n", document.toString());
		}
		catch (Exception e) {
		}
	}

	@Test
	@DisplayName("write character -> saved file output correct")
	public void testSave() {
		try {
			Document document = new Document("testSave.txt");

			document.write("A", new CharacterProperty[] {
				document.getCharacterPropertyFactory().getProperty("font", "Arial")
			});

			document.save();

			BufferedReader reader = new BufferedReader(new FileReader("testSave.txt"));

			String correctInput = "A font=Arial";

			Assert.assertEquals(correctInput, reader.readLine());
		}
		catch (Exception e) {
		}
	}
}

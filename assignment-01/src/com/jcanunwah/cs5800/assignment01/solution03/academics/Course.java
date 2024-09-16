package com.jcanunwah.cs5800.assignment01.solution03.academics;

public class Course
{
	private String name;
	private Instructor instructor;
	private Textbook textbook;

	public Course(String name, Instructor instructor, Textbook textbook)
		this.name = name;
		this.instructor = instructor;
		this.textbook = textbook;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void print() {
		System.out.println(
			"Instructor: " + this.instructor.getFirstName() + " " + this.instructor.getLastName() +
			", Textbook: '" + this.textbook.getTitle() + "' by " + this.textbook.getAuthor()
		);
	}
}

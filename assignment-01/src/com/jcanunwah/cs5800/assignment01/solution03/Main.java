package com.jcanunwah.cs5800.assignment01.solution03;

import com.jcanunwah.cs5800.assignment01.solution03.academics.*;

public class Main
{
	public static void main(String[] args) {
		String courseName = "CS 5800";

		Instructor nima = new Instructor("Nima", "Davarpanah", "3-2636");
		Instructor john = new Instructor("John", "Doe", "8-8");

		Textbook cleanCode = new Textbook("Clean Code", "Robert C. Hall", "Prentice Hall");
		Textbook programming101 = new Textbook("Programming 101", "Alice T. Bob", "Pearson");

		Course section1 = new Course(courseName, nima, cleanCode);
		Course section2 = new Course(courseName, john, programming101);

		System.out.println(courseName + ":");

		section1.print();
		section2.print();
	}
}

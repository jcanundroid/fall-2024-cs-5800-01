package com.jcanunwah.cs5800.assignment01.solution04.filesystem;

import java.util.ArrayList;

public abstract class FileSystemObject
{
	private String name;

	public FileSystemObject(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void print() {
		this.print(0);
	}

	protected String makeIndentationPrefix(int n) {
		return new String(new char[n]).replace("\0", "  ");
	}

	public abstract void print(int indentation);
	public abstract void delete();
	public abstract boolean isLeaf();
}

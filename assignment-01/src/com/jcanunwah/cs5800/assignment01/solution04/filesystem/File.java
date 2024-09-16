package com.jcanunwah.cs5800.assignment01.solution04.filesystem;

public class File extends FileSystemObject
{
	public File(String name) {
		super(name);
	}

	public void print(int indentation) {
		System.out.println(this.makeIndentationPrefix(indentation) + this.getName());
	}

	public void delete() {
	}

	public boolean isLeaf() {
		return true;
	}
}

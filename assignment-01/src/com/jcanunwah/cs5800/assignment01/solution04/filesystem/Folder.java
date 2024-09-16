package com.jcanunwah.cs5800.assignment01.solution04.filesystem;

import java.util.Arrays;
import java.util.ArrayList;

public class Folder extends FileSystemObject
{
	private ArrayList<FileSystemObject> items;

	public Folder(String name) {
		this(name, new FileSystemObject[0]);
	}

	public Folder(String name, FileSystemObject[] items) {
		super(name);

		this.items = new ArrayList<FileSystemObject>(Arrays.asList(items));
	}

	public void print(int indentation) {
		System.out.println(this.makeIndentationPrefix(indentation) + this.getName() + "/");

		this.printItems(false, indentation + 1);
		this.printItems(true, indentation + 1);
	}

	public void delete() {
		for (FileSystemObject fso : this.items) {
			fso.delete();
		}

		this.items.clear();
	}

	public void delete(String name) {
		int index = -1;

		for (int i = 0; i < this.items.size(); ++i) {
			if (this.items.get(i).getName() == name) {
				index = i;
				break;
			}
		}

		if (index > -1) {
			this.items.get(index).delete();
			this.items.remove(index);
		}
	}

	public boolean isLeaf() {
		return false;
	}

	private void printItems(boolean isLeaf, int indentation) {
		for (FileSystemObject fso : this.items) {
			if (fso.isLeaf() == isLeaf) {
				fso.print(indentation);
			}
		}
	}
}

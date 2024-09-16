package com.jcanunwah.cs5800.assignment01.solution04;

import com.jcanunwah.cs5800.assignment01.solution04.filesystem.*;

public class Main
{
	public static void main(String[] args) {
		Folder sourceFilesFolder = new Folder("Source Files", new FileSystemObject[] {
			new Folder(".phalcon"),
			new Folder("app", new FileSystemObject[] {
				new Folder("config"),
				new Folder("controllers"),
				new Folder("library"),
				new Folder("migrations"),
				new Folder("models"),
				new Folder("views")
			}),
			new Folder("cache"),
			new Folder("public"),
			new File(".htaccess"),
			new File(".htrouter.php"),
			new File("index.html"),
		});

		Folder root = new Folder("php_demo1", new FileSystemObject[] {
			new Folder("Include Path"),
			sourceFilesFolder,
			new Folder("Remote Files")
		});

		System.out.println("Intial php_demo1 state:\n");
		root.print();

		sourceFilesFolder.delete("app");

		System.out.println("\nphp_demo1 after removing app folder:\n");
		root.print();

		sourceFilesFolder.delete("public");

		System.out.println("\nphp_demo1 after removing public folder:\n");
		root.print();
	}
}

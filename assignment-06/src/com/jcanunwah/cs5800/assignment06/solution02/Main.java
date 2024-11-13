package com.jcanunwah.cs5800.assignment06.solution02;

import java.util.ArrayList;

import com.jcanunwah.cs5800.assignment06.solution02.music.*;

public class Main
{
	public static void main(String[] args) {
		SongServerProxy server = new SongServerProxy();

		System.out.println("Searching by ID = 102:\n");

		Song song = server.searchByID(102);
		System.out.println(song);

		System.out.println("\nSearching by title = 'What is Love?':\n");

		ArrayList<Song> titleSongs = server.searchByTitle("What is Love?");
		System.out.println(titleSongs.get(0));

		System.out.println("\nSearching by album = 'Arrival':\n");

		ArrayList<Song> albumSongs = server.searchByAlbum("Arrival");

		for (Song albumSong : albumSongs) {
			System.out.println(albumSong + "\n");
		}
	}
}

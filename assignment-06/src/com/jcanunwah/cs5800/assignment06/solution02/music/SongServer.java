package com.jcanunwah.cs5800.assignment06.solution02.music;

import java.util.ArrayList;

public class SongServer implements SongService
{
	private static Song[] songs = new Song[] {
		new Song(100, "Dancing Queen", "ABBA", "Arrival", 230),
		new Song(101, "What is Love?", "Haddaway", "The Album", 269),
		new Song(102, "Nothing's Gonna Stop Us", "Starship", "No Protection", 269),
		new Song(103, "Last Christmas", "Wham!", "Music from the Edge of Heaven", 268),
		new Song(104, "My Heart Will Go On", "Celine Dion", "Titatic: Music from the Motion Picture", 280),
		new Song(105, "Angeleyes", "ABBA", "Arrival", 251)
	};

	public SongServer() {
	}

	public Song searchByID(int songID) {
		this.simulateDelay();

		for (Song s : this.songs) {
			if (s.getID() == songID) {
				return s;
			}
		}

		return null;
	}

	public ArrayList<Song> searchByTitle(String title) {
		ArrayList<Song> results = new ArrayList<>();

		this.simulateDelay();

		if (title.length() == 0) {
			return results;
		}

		for (Song s : this.songs) {
			if (s.getTitle().toLowerCase().startsWith(title.toLowerCase())) {
				results.add(s);
			}
		}

		return results;
	}

	public ArrayList<Song> searchByAlbum(String album) {
		ArrayList<Song> results = new ArrayList<>();

		this.simulateDelay();

		if (album.length() == 0) {
			return results;
		}

		for (Song s : this.songs) {
			if (s.getAlbum().toLowerCase().startsWith(album.toLowerCase())) {
				results.add(s);
			}
		}

		return results;
	}

	private void simulateDelay() {
		try {
			Thread.sleep(1000);
		}
		catch (Exception e) {
		}
	}
}

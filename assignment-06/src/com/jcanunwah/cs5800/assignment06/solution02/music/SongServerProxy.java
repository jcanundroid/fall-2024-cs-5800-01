package com.jcanunwah.cs5800.assignment06.solution02.music;

import java.util.ArrayList;
import java.util.HashMap;

public class SongServerProxy implements SongService
{
	private SongServer server;

	private HashMap<Integer, Song> searchByIDCache;
	private HashMap<String, ArrayList<Song>> searchByTitleCache;
	private HashMap<String, ArrayList<Song>> searchByAlbumCache;

	public SongServerProxy() {
		this.server = new SongServer();
		this.searchByIDCache = new HashMap<>();
		this.searchByTitleCache = new HashMap<>();
		this.searchByAlbumCache = new HashMap<>();
	}

	public Song searchByID(int songID) {
		if (this.searchByIDCache.containsKey(songID)) {
			return this.searchByIDCache.get(songID);
		}

		Song song = this.server.searchByID(songID);

		this.searchByIDCache.put(songID, song);

		return song;
	}

	public ArrayList<Song> searchByTitle(String title) {
		if (this.searchByTitleCache.containsKey(title)) {
			return this.searchByTitleCache.get(title);
		}

		ArrayList<Song> songs = this.server.searchByTitle(title);

		this.searchByTitleCache.put(title, songs);

		return songs;
	}

	public ArrayList<Song> searchByAlbum(String album) {
		if (this.searchByAlbumCache.containsKey(album)) {
			return this.searchByAlbumCache.get(album);
		}

		ArrayList<Song> songs = this.server.searchByAlbum(album);

		this.searchByAlbumCache.put(album, songs);

		return songs;
	}
}

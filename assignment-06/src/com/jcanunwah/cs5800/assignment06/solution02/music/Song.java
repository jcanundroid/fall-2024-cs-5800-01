package com.jcanunwah.cs5800.assignment06.solution02.music;

import java.util.List;

public class Song
{
	private int id;
	private String title;
	private String artist;
	private String album;
	private int duration;

	public Song(int id, String title, String artist, String album, int duration) {
		this.id = id;
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.duration = duration;
	}

	public int getID() {
		return this.id;
	}

	public String getTitle() {
		return this.title;
	}

	public String getArtist() {
		return this.artist;
	}

	public String getAlbum() {
		return this.album;
	}

	public int getDuration() {
		return this.duration;
	}

	public String toString() {
		return this.id + ": " + this.title + "\n" +
			"  Artist: " + this.artist + "\n" +
			"  Album: " + this.album + "\n" +
			"  Duration: " + this.duration;
	}
}

package com.jcanunwah.cs5800.assignment06.solution02.music;

import java.util.List;

public interface SongService
{
	public Song searchByID(int songID);
	public List<Song> searchByTitle(String title);
	public List<Song> searchByAlbum(String album);
}

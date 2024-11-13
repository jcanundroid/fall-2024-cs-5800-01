package com.jcanunwah.cs5800.assignment06.solution02.tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import com.jcanunwah.cs5800.assignment06.solution02.music.*;

public class SongServerTest
{
	@Test
	@DisplayName("search by ID with invalid ID -> null")
	public void testSearchByIDInvalidIsNull() {
		SongServer server = new SongServer();
		Assert.assertEquals(null, server.searchByID(-1));
	}

	@Test
	@DisplayName("search by ID with valid ID -> song with same ID")
	public void testSearchByIDValidResultHasSameID() {
		SongServer server = new SongServer();
		Assert.assertEquals(100, server.searchByID(100).getID());
	}

	@Test
	@DisplayName("search by title with invalid title -> empty list")
	public void testSearchByTitleInvalidIsEmptyList() {
		SongServer server = new SongServer();
		Assert.assertEquals(0, server.searchByTitle("").size());
	}
}

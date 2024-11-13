package com.jcanunwah.cs5800.assignment06.solution02.tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import com.jcanunwah.cs5800.assignment06.solution02.music.*;

public class SongServerProxyTest
{
	@Test
	@DisplayName("proxy cache faster than server")
	public void testProxyCacheSpeed() {
		SongServerProxy proxy = new SongServerProxy();

		int[] songIDs = new int[] { 100, 101, 102, 103, 104, 105 };

		for (int id : songIDs) {
			long startTimeServer = System.nanoTime();

			proxy.searchByID(id);

			long endTimeServer = System.nanoTime();
			long startTimeProxy = System.nanoTime();

			proxy.searchByID(id);

			long endTimeProxy = System.nanoTime();

			Assert.assertTrue((endTimeProxy - startTimeProxy) < (endTimeServer - startTimeServer));
		}
	}
}

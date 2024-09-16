package com.jcanunwah.cs5800.assignment01.solution02;

import com.jcanunwah.cs5800.assignment01.solution02.ships.*;

public class Main
{
	public static void main(String[] args) {
		Ship[] ships = {
			new Ship("Mayflower", "1609"),
			new CruiseShip("Lusitania", "1904", 2198),
			new CargoShip("Evergiven", "2021", 220940)
		};

		for (Ship s : ships) {
			s.print();
		}
	}
}

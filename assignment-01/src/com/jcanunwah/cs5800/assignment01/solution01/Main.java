package com.jcanunwah.cs5800.assignment01.solution01;

import com.jcanunwah.cs5800.assignment01.solution01.employees.*;

public class Main
{
	public static void main(String[] args) {
		SalariedEmployee joe = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500.0);
		HourlyEmployee stephanie = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25.0, 32.0);
		HourlyEmployee mary = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19.0, 47.0);
		ComissionEmployee nicole = new ComissionEmployee("Nicole", "Dior", "444-44-4444", 15.0, 50000.0);
		SalariedEmployee renwa = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700.0);
		BaseEmployee mike = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000.0);
		ComissionEmployee mahnaz = new ComissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 22.0, 40000.0);
	}
}

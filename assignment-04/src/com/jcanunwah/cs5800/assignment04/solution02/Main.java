package com.jcanunwah.cs5800.assignment04.solution02;

import com.jcanunwah.cs5800.assignment04.solution02.meals.*;

public class Main
{
	public static void main(String[] args) {
		MealFactory unrestrictedMealFactory = MealFactoryCreator.getInstance().createFactory("unrestricted");
		MealFactory paleoMealFactory = MealFactoryCreator.getInstance().createFactory("paleo");
		MealFactory veganMealFactory = MealFactoryCreator.getInstance().createFactory("vegan");
		MealFactory nutlessMealFactory = MealFactoryCreator.getInstance().createFactory("nutless");

		Meal meal1 = unrestrictedMealFactory.createMeal();
		Meal meal2 = unrestrictedMealFactory.createMeal();
		Meal meal3 = unrestrictedMealFactory.createMeal();
		Meal meal4 = paleoMealFactory.createMeal();
		Meal meal5 = veganMealFactory.createMeal();
		Meal meal6 = nutlessMealFactory.createMeal();

		Customer customer1 = new Customer("Alice (unrestricted)", meal1);
		Customer customer2 = new Customer("Bob (unrestricted)", meal2);
		Customer customer3 = new Customer("Candace (unrestricted)", meal3);
		Customer customer4 = new Customer("Dobby (paleo)", meal4);
		Customer customer5 = new Customer("Eris (vegan)", meal5);
		Customer customer6 = new Customer("Frank (nutless)", meal6);

		customer1.print();
		customer2.print();
		customer3.print();
		customer4.print();
		customer5.print();
		customer6.print();
	}
}

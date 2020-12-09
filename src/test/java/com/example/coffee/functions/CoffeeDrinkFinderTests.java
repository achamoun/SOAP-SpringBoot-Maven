package com.example.coffee.functions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.example.coffee.functions.CoffeeDrinkFinder;
import com.example.coffee.pojo.Drink;

public class CoffeeDrinkFinderTests {

	private CoffeeDrinkFinder coffeeDrinkFinder = new CoffeeDrinkFinder();

	@Test
	void getCoffeeDrinkTest() {

		capuccinoTest();
		notCappuccinoTest();
		americanoTest();
		notAmericanoTest();

	}

	private void capuccinoTest() {

		ArrayList<String> ingredients = new ArrayList<String>();
		ingredients.add("espresso");
		ingredients.add("milk");
		assertEquals(Drink.CAPPUCCINO, coffeeDrinkFinder.getCoffeeDrink(ingredients).getCoffeeDrink());

	}

	private void notCappuccinoTest() {

		ArrayList<String> ingredients = new ArrayList<String>();
		ingredients.add("espresso");
		ingredients.add("water");
		assertNotEquals(Drink.CAPPUCCINO, coffeeDrinkFinder.getCoffeeDrink(ingredients).getCoffeeDrink());

	}

	private void americanoTest() {
		ArrayList<String> ingredients = new ArrayList<String>();
		ingredients.add("espresso");
		ingredients.add("water");
		assertEquals(Drink.AMERICANO, coffeeDrinkFinder.getCoffeeDrink(ingredients).getCoffeeDrink());
	}

	private void notAmericanoTest() {
		ArrayList<String> ingredients = new ArrayList<String>();
		ingredients.add("espresso");
		ingredients.add("milk");
		assertNotEquals(Drink.AMERICANO, coffeeDrinkFinder.getCoffeeDrink(ingredients).getCoffeeDrink());

	}

}

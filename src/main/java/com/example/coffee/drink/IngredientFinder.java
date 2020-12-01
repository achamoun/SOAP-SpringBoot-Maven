package com.example.coffee.drink;

import java.util.List;

/**
 * this class offers a method to find out the ingredients of a coffee drink
 * 
 * @author aboud
 *
 */
public class IngredientFinder {

	/**
	 * we will grant the world access to use this method. in another words we will
	 * make it a web service.
	 * 
	 * @param coffeeDrink
	 * @return
	 */
	public List<Ingredient> findIngredients(String coffeeDrink) {

		switch (coffeeDrink) {
		case "cappucino":
			return new Cappucinno().getIngredientList();

		case "americano":
			return new Americano().getIngredientList();

		default:

			break;
		}

		return null;

	}

}

package com.example.coffee.drink;

import java.util.ArrayList;

public class Cappucinno extends CoffeeDrink {

	private ArrayList<Ingredient> ingredientList;

	public Cappucinno() {

		ingredientList = new ArrayList<Ingredient>();
		ingredientList.add(Ingredient.ESPRESSO_SHOT);
		ingredientList.add(Ingredient.MILK_FOAM);
		setCoffeeDrink(Drink.CAPPUCCINO);
	}

	public ArrayList<Ingredient> getIngredientList() {
		return ingredientList;
	}

	private void setIngredientList(ArrayList<Ingredient> ingredientList) {
		this.ingredientList = ingredientList;
	}

}

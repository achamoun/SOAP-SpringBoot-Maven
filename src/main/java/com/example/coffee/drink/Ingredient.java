package com.example.coffee.drink;

public enum Ingredient {

	HOT_WATER, ESPRESSO_SHOT, MILK_FOAM;

	@Override
	public String toString() {

		switch (this) {
		case HOT_WATER:
			return "water";
		case ESPRESSO_SHOT:
			return "espresso";
		case MILK_FOAM:
			return "milk";
		default:
			return "";
		}

	}

}

package com.example.coffee.drink;

public enum Drink {

	CAPPUCCINO, AMERICANO;

	@Override
	public String toString() {

		switch (this) {
		case CAPPUCCINO:
			return "cappuccino";
		case AMERICANO:
			return "americano";
		default:
			return "";
		}
	}

}

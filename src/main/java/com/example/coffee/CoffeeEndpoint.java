package com.example.coffee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.coffee.functions.CoffeeDrinkFinder;
import com.example.coffee.functions.IngredientFinder;
import com.example.coffee.pojo.Ingredient;
import com.makemycoffee.mydrink.GetCoffeeDrinkIngredientsRequest;
import com.makemycoffee.mydrink.GetCoffeeDrinkIngredientsResponse;
import com.makemycoffee.mydrink.GetCoffeeDrinkRequest;
import com.makemycoffee.mydrink.GetCoffeeDrinkResponse;

@Endpoint
public class CoffeeEndpoint {
	private static final String NAMESPACE_URI = "http://makemycoffee.com/mydrink";
	private CoffeeDrinkFinder coffeeDrinkFinder;
	private IngredientFinder ingredientFinder;

	@Autowired
	public CoffeeEndpoint() {
		coffeeDrinkFinder = new CoffeeDrinkFinder();
		ingredientFinder = new IngredientFinder();
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCoffeeDrinkIngredientsRequest")
	@ResponsePayload
	public GetCoffeeDrinkIngredientsResponse getCoffeeDrinkIngredients(@RequestPayload GetCoffeeDrinkIngredientsRequest request) {

		GetCoffeeDrinkIngredientsResponse response = new GetCoffeeDrinkIngredientsResponse();
		for (Ingredient ingredient : ingredientFinder.findIngredients(request.getRequestCoffeeDrink())) {
			response.getResponseIngredientList().add(ingredient.toString());
		}
		return response;
	}

	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCoffeeDrinkRequest")
	@ResponsePayload
	public GetCoffeeDrinkResponse getCoffeeDrink(@RequestPayload GetCoffeeDrinkRequest request) {
		GetCoffeeDrinkResponse response = new GetCoffeeDrinkResponse();
		response.setResponseCoffeeDrink(
				coffeeDrinkFinder.getCoffeeDrink(request.getRequestIngredientList()).getCoffeeDrink().toString());
		return response;
	}
}

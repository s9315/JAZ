package com.example.jsfdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.example.jsfdemo.domain.Pizza;

@ApplicationScoped
public class PizzaManager {
	private List<Pizza> db = new ArrayList<Pizza>();

	public void addPizza(Pizza pizza) {
		Pizza newPizza = new Pizza();

		newPizza.setFirstName(pizza.getFirstName());
		newPizza.setPizzaName(pizza.getPizzaName());
		newPizza.setPhoneNumber(pizza.getPhoneNumber());
		newPizza.setAdres(pizza.getAdres());
		newPizza.setIngredients(pizza.getIngredients());
		newPizza.setProductName(pizza.getProductName());
		newPizza.setDateToGet(pizza.getDateToGet());
		

		db.add(newPizza);
	}

	// Removes the person with given PIN
	public void deletePizza(Pizza pizza) {
		Pizza pizzaToRemove = null;
		for (Pizza p : db) {
			if (pizza.getFirstName().equals(p.getFirstName())) {
				pizzaToRemove = p;
				break;
			}
		}
		if (pizzaToRemove != null)
			db.remove(pizzaToRemove);
	}

	public List<Pizza> getAllPizzas() {
		return db;
	}
}

package com.example.jsfdemo.web;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIForm;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;
import javax.faces.model.ListDataModel;
import javax.faces.validator.ValidatorException;
import javax.inject.Inject;
import javax.inject.Named;

import com.example.jsfdemo.domain.Pizza;
import com.example.jsfdemo.service.PizzaManager;

@SessionScoped
@Named("pizzaBean")
public class PizzaFormBean implements Serializable {

private static final long serialVersionUID = 1L;

private Pizza pizza = new Pizza();

private ListDataModel<Pizza> pizzas = new ListDataModel<Pizza>();

@Inject
private PizzaManager pm;

public Pizza getPizza() {
return pizza;
}

public void setPizza(Pizza pizza) {
this.pizza = pizza;
}


public ListDataModel<Pizza> getAllPizzas() {
pizzas.setWrappedData(pm.getAllPizzas());
return pizzas;
}

//Actions
public String addPizza() {
pm.addPizza(pizza);
return "showPizzas";
//return null;
}

public String deletePizza() {
Pizza pizzaToDelete = pizzas.getRowData();
pm.deletePizza(pizzaToDelete);
return null;
}

}
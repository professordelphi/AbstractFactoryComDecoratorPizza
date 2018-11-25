package com.pizza.fabrica.filial;

import com.pizza.CheesePizzaAracaju;
import com.pizza.IPizza;
import com.pizza.PresuntoPizza;
import com.pizza.store.order.PizzaStore;

public class PizzaFilialAracaju extends PizzaStore {
	private IPizza pizza = null;

	public PizzaFilialAracaju() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public IPizza createPizza(String item) {

		// inserir metodo aqui

		if (item.equals("PresuntoPizza")) {
			pizza = new PresuntoPizza();

		}

		if (item.equals("CheesePizza")) {
			pizza = new CheesePizzaAracaju();
		}

		return pizza;
	}

}

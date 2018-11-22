package com.pizza.fabrica.filial;

import com.pizza.CheesePizzaAracaju;
import com.pizza.IPizza;
import com.pizza.PresuntoPizza;
import com.pizza.store.order.PizzaStore;

public class PizzaFilialAracaju extends PizzaStore {

	public PizzaFilialAracaju() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public IPizza createPizza(String item) {
		IPizza pizza=null;
		//inserir metodo aqui
		
		if(item.equals("PresuntoPizza"))
		{
			pizza=new PresuntoPizza();
			
		}
		
		if(item.equals("CheesePizza"))
		{
			pizza=new CheesePizzaAracaju();
		}
		
		return pizza;
	}
	
}

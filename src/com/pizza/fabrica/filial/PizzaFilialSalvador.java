package com.pizza.fabrica.filial;

import com.pizza.CheesePizzaEspecialAmericano;

import com.pizza.IPizza;
import com.pizza.PresuntoPizza;
import com.pizza.store.order.PizzaStore;


public class PizzaFilialSalvador extends PizzaStore {
	private IPizza pizza=null;
	public PizzaFilialSalvador() {
		super();
		// TODO Auto-generated constructor stub
	}



@Override	
public IPizza createPizza(String type)
	
	{
		
		//inserir metodo aqui
		
		if(type.equals("CheesePizza"))
		{
			pizza=new CheesePizzaEspecialAmericano();
		}
		
		
		if(type.equals("Presunto"))
		{
			pizza=new PresuntoPizza();
		}
		
		return pizza;
	}


}

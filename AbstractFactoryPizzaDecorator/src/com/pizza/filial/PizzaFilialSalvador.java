package com.pizza.filial;

import com.pizza.CheesePizza;
import com.pizza.CheesePizzaAracaju;
import com.pizza.CheesePizzaEspecialAmericano;
import com.pizza.CheesePizzaSalvador;
import com.pizza.IPizza;
import com.pizza.PresuntoPizza;
import com.pizza.factory.PizzaStore;


public class PizzaFilialSalvador extends PizzaStore {

	public PizzaFilialSalvador() {
		super();
		// TODO Auto-generated constructor stub
	}



@Override	
public IPizza createPizza(String type)
	
	{
		IPizza pizza=null;
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

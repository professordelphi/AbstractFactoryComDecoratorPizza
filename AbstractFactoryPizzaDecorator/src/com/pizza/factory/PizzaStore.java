/**
 * 
 */
package com.pizza.factory;

import com.pizza.IPizza;

/**
 * @author marcos.rodrigues
 *
 */
public abstract class PizzaStore {
//	SimplePizzaFactory factory=new SimplePizzaFactory();
	/**
	 * 
	 */
	
	public PizzaStore()
	{}
	
	
	public IPizza orderPizza(String type)
	{
		IPizza pizza=null;

		pizza=createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;

	}
	
public	abstract IPizza createPizza(String item);
	

}

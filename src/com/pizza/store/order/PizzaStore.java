/**
 * 
 */
package com.pizza.store.order;

import com.pizza.IPizza;

/**
 * @author marcos.rodrigues
 *
 */
public abstract class PizzaStore {

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

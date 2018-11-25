/**
 * 
 */
package com.pizza.decorator.oregano;

import com.pizza.decorator.IPizzaDecorator;
import com.pizza.decorator.PizzaDecorator;

/**
 * @author marcos.rodrigues
 *
 */
public class OreganoDecorator extends PizzaDecorator  {

	/**
	 * @param iPizzaDecorator
	 */
	public OreganoDecorator(IPizzaDecorator iPizzaDecorator) {
		super(iPizzaDecorator);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return "Oregano " + super.getDescricao() ;
	}

	/* (non-Javadoc)
	 * @see com.decorator.Bebida#getCusto()
	 */
	@Override
	public float getCusto() {
		// TODO Auto-generated method stub
		return 3 + super.getCusto();
	}

	/* (non-Javadoc)
	 * @see com.decorator.Bebida#getCaloria()
	 */
	@Override
	public float getCaloria() {
		// TODO Auto-generated method stub
		return 5 + super.getCaloria();
	}
	
}

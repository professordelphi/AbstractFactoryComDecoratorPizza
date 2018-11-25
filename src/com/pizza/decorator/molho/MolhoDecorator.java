/**
 * 
 */
package com.pizza.decorator.molho;

import com.pizza.decorator.IPizzaDecorator;
import com.pizza.decorator.PizzaDecorator;

/**
 * @author marcos.rodrigues
 *
 */
public class MolhoDecorator extends PizzaDecorator {

	IPizzaDecorator iPizzaDecorator;
	
	
	public MolhoDecorator(IPizzaDecorator iPizzaDecorator) {
		super(iPizzaDecorator);
		// TODO Auto-generated constructor stub
	}

	
	/* (non-Javadoc)
	 * @see com.pizza.decorator.IPizzaDecorator#getDescricao()
	 */
	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return "Molho " +super.getDescricao();
	}

	/* (non-Javadoc)
	 * @see com.pizza.decorator.IPizzaDecorator#getCusto()
	 */
	@Override
	public float getCusto() {
		// TODO Auto-generated method stub
		return  (float)7 + super.getCusto();
	}

	/* (non-Javadoc)
	 * @see com.pizza.decorator.IPizzaDecorator#getCaloria()
	 */
	@Override
	public float getCaloria() {
		// TODO Auto-generated method stub
		return 150+super.getCaloria();
	}
}

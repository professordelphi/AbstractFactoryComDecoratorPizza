/**
 * 
 */
package com.pizza.decorator;

/**
 * @author marcos.rodrigues
 *
 */
public abstract class PizzaDecorator implements IPizzaDecorator {

	IPizzaDecorator iPizzaDecorator;
	
	/**
	 * 
	 */
	public PizzaDecorator(IPizzaDecorator iPizzaDecorator) {
		// TODO Auto-generated constructor stub
		this.iPizzaDecorator=iPizzaDecorator;
	}
	public PizzaDecorator() {
		// TODO Auto-generated constructor stub
		
	}
	/* (non-Javadoc)
	 * @see com.pizza.decorator.IPizzaDecorator#getDescricao()
	 */
	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return this.iPizzaDecorator.getDescricao();
	}

	/* (non-Javadoc)
	 * @see com.pizza.decorator.IPizzaDecorator#getCusto()
	 */
	@Override
	public float getCusto() {
		// TODO Auto-generated method stub
		return this.iPizzaDecorator.getCusto();
	}

	/* (non-Javadoc)
	 * @see com.pizza.decorator.IPizzaDecorator#getCaloria()
	 */
	@Override
	public float getCaloria() {
		// TODO Auto-generated method stub
		return this.iPizzaDecorator.getCaloria();
	}

}

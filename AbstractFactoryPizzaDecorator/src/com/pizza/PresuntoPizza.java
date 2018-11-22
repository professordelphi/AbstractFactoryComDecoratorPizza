/**
 * 
 */
package com.pizza;

/**
 * @author marcos.rodrigues
 *
 */
public class PresuntoPizza implements IPizza {

	/**
	 * 
	 */
	public PresuntoPizza() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.pizza.Pizza#prepare()
	 */
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Preparando a pizza - presunto" );
	}

	/* (non-Javadoc)
	 * @see com.pizza.Pizza#bake()
	 */
	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("bake a pizza - presunto" );
	}

	/* (non-Javadoc)
	 * @see com.pizza.Pizza#cut()
	 */
	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("Cortando a pizza - Presunto - em Cubos");
	}

	/* (non-Javadoc)
	 * @see com.pizza.Pizza#box()
	 */
	@Override
	public void box() {
		// TODO Auto-generated method stub
		System.out.println("Colocando na caixa - PresuntoPizza");
	}

}

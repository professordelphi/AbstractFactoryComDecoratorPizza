/**
 * 
 */
package com.pizza;

/**
 * @author marcos.rodrigues
 *
 */
public class CheesePizzaAracaju extends CheesePizza {

	/**
	 * 
	 */
	public CheesePizzaAracaju() {
		// TODO Auto-generated constructor stub
	}
/* (non-Javadoc)
 * 	 * @see com.pizza.Pizza#prepare()
	 */
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
     System.out.println("Preparando a pizza - CheesePizza borda de queijo Aracaju" );
//     Foi criado a classe CheesePizzaAracaju para personalizar a fabricacao de pizzas para a cidade de Aracaju
//     Marcos 22-11-2018
	}

	/* (non-Javadoc)
	 * @see com.pizza.Pizza#bake()
	 */
	@Override
	public void bake() {
		// TODO Auto-generated method stub
System.out.println("Bake Pizza - CheesePizza - Sergipe");



	}

	/* (non-Javadoc)
	 * @see com.pizza.Pizza#cut()
	 */
	@Override
	public void cut() {
		// TODO Auto-generated method stub
System.out.println("Cortando a pizza - CheesePizza");
	}

	/* (non-Javadoc)
	 * @see com.pizza.Pizza#box()
	 */
	@Override
	public void box() {
		// TODO Auto-generated method stub
System.out.println("Colocando na caixa - CheesePizza");
	}

}

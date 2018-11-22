/**
 * 
 */
package com.pizza;

/**
 * @author marcos.rodrigues
 *
 */
public class CheesePizzaSalvador extends CheesePizza {

	/**
	 * 
	 */
	public CheesePizzaSalvador() {
		// TODO Auto-generated constructor stub
	}
/* (non-Javadoc)
 * 	 * @see com.pizza.Pizza#prepare()
	 */
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
     System.out.println("Preparando a pizza - CheesePizza Estilo Salvador Pituba" );
	}


	/* (non-Javadoc)
	 * @see com.pizza.Pizza#box()
	 */
	@Override
	public void box() {
		// TODO Auto-generated method stub
System.out.println("Colocando na caixa - CheesePizza - entrega apenas com motoboy");
	}

}

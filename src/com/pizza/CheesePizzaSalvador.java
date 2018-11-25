/**
 * 
 */
package com.pizza;



/**
 * @author marcos.rodrigues
 *
 */

public class CheesePizzaSalvador implements IPizza
{

	/**
	 * 
	 */

	IPizza iPizza;
	
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
	
	public void box() {
		// TODO Auto-generated method stub
System.out.println("Colocando na caixa - CheesePizza - entrega apenas com motoboy");
	}
	
	@Override
	public void bake() {
		// TODO Auto-generated method stub
		iPizza= new CheesePizza();
		iPizza.bake();
	}
	
	@Override
	public void cut() {
		// TODO Auto-generated method stub
iPizza= new CheesePizza();
iPizza.cut();
	}

}

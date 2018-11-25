/**
 * 
 */
package com.pizza;



/**
 * @author marcos.rodrigues
 *
 */
public class CheesePizzaEspecialAmericano implements IPizza {

	
	IPizza iPizza;
	/**
	 * 
	 */
	public CheesePizzaEspecialAmericano() {
		// TODO Auto-generated constructor stub
	}
/* (non-Javadoc)
 * 	 * @see com.pizza.Pizza#prepare()
	 */
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
     System.out.println("Preparando a pizza - CheesePizza - Americano Especial" );
	}

	/* (non-Javadoc)
	 * @see com.pizza.Pizza#bake()
	 */
	@Override
	public void bake() {
		// TODO Auto-generated method stub
System.out.println("Bake Pizza - CheesePizza - Americano Especial");



	}
	@Override
	public void cut() {
		// TODO Auto-generated method stub
		
		iPizza=new CheesePizza();
		iPizza.cut();
		
	}
	@Override
	public void box() {
		// TODO Auto-generated method stub
		iPizza=new CheesePizzaSalvador();
		iPizza.box();
	}


}

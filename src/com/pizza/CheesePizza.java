/**
 * 
 */
package com.pizza;

import com.pizza.decorator.IPizzaDecorator;

/**
 * @author marcos.rodrigues
 *
 */
public class CheesePizza implements IPizza,IPizzaDecorator {

	/**
	 * 
	 */
	public CheesePizza() {
		// TODO Auto-generated constructor stub
	}
/* (non-Javadoc)
 * 	 * @see com.pizza.Pizza#prepare()
	 */
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
     System.out.println("Preparando a pizza - CheesePizza não tem alteracao" );
	}

	/* (non-Javadoc)
	 * @see com.pizza.Pizza#bake()
	 */
	@Override
	public void bake() {
		// TODO Auto-generated method stub
System.out.println("Bake Pizza - CheesePizza - tradicional");
	}

	/* (non-Javadoc)
	 * @see com.pizza.Pizza#cut()
	 */
	@Override
	public void cut() {
		// TODO Auto-generated method stub
System.out.println("Cortando a pizza - CheesePizza - tradicional");
	}

	/* (non-Javadoc)
	 * @see com.pizza.Pizza#box()
	 */
	@Override
	public void box() {
		// TODO Auto-generated method stub
System.out.println("Colocando na caixa - CheesePizza");
	}
	
//	**************** Parte abaixo foi implementada para fazer parte do fluxo 
	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return "Pizza cheese";
	}
	@Override
	public float getCusto() {
		// TODO Auto-generated method stub
		return 45;
	}
	@Override
	public float getCaloria() {
		// TODO Auto-generated method stub
		return 390;
	}

}

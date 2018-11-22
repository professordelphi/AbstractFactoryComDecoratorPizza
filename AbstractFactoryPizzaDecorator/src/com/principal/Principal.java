package com.principal;

import com.pizza.CheesePizza;
import com.pizza.decorator.IPizzaDecorator;
import com.pizza.decorator.molho.MolhoDecorator;
import com.pizza.decorator.oregano.OreganoDecorator;
import com.pizza.fabrica.filial.PizzaFilialAracaju;
import com.pizza.fabrica.filial.PizzaFilialSalvador;
import com.pizza.store.order.PizzaStore;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {

		System.out.println("Descricao       Valor      Calorias");
        IPizzaDecorator cheese = new CheesePizza();
		System.err.println(cheese.getDescricao() + " = R$" + cheese.getCusto() + " com " + cheese.getCaloria() + " Calorias");

		//Decorando com Oregano
		cheese = new OreganoDecorator(cheese);
		System.out.println(cheese.getDescricao() + " = R$" + cheese.getCusto() + " com " + cheese.getCaloria() + " Calorias");
		//Decorando com Molho
		cheese= new MolhoDecorator(cheese);
		System.out.println(cheese.getDescricao() + " = R$" + cheese.getCusto() + " com " + cheese.getCaloria() + " Calorias");
		System.out.println(" ");
		System.out.println("Filial Salvador");
		System.out.println("----------------------");
		PizzaStore salvador=new PizzaFilialSalvador();
		salvador.orderPizza("CheesePizza");
		
		System.out.println("Filial Aracaju");	
		System.out.println("----------------------");
		PizzaStore aracaju=new PizzaFilialAracaju();
		aracaju.orderPizza("PresuntoPizza");
		aracaju.orderPizza("CheesePizza");

//		ctrl+shift+x = colocar letras em maiusculas
//		ctrl+shift+c = colocar a linha em comentario
//		ctrl+shift+e = abre a tela de lista de classes abertas
//		ctrl+shift+l = pesquisa nomes, metodos etc tipo um search
//		alt+shift+a = seleciona um bloco de comando atraves do mouse
//		lista os metodos da classe para serem procurados
//		ctrl+D = tira a linha
//	    ctrl+G
	}
}

package br.com.aplicacao.factory;

import java.util.HashMap;
import java.util.Objects;

import br.com.aplicacao.formas.Circulo;
import br.com.aplicacao.inter.Forma;

public class FormaFactory {
	
	private static final HashMap<String,Circulo> circuloMap = new HashMap<String, Circulo>();
	
	   public static Forma getCirculo(String color) {
		      Circulo circulo = circuloMap.get(color);
		      if(Objects.isNull(circulo)) {
		    	 circulo = new Circulo(color);
		    	 circuloMap.put(color, circulo);
		         System.out.println("Criando um circulo da cor: " + color);
		      }
		      return circulo;
		   }

}

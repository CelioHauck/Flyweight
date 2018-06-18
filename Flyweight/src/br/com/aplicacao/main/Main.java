package br.com.aplicacao.main;

import br.com.aplicacao.factory.FormaFactory;
import br.com.aplicacao.formas.Circulo;

public class Main {
	private static final String cores[] = { "Vermelho", "Verde", "Azul", "Branco", "Preto" };
	public static void main(String[] args) {

	    for(int i=0; i < 20; ++i) {
	         Circulo circulo = (Circulo) FormaFactory.getCirculo(getRandomColor());
	         circulo.setX(randomizar());
	         circulo.setY(randomizar());
	         circulo.setRaio(100);
	         circulo.desenhar();
	      }
	   }
	   private static String getRandomColor() {
	      return cores[(int) (Math.random()*cores.length)];
	   }
	   
	   private static Integer randomizar() {
	      return (int)(Math.random()*100 );
	   }
	   
	}



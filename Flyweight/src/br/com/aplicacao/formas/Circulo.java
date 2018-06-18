package br.com.aplicacao.formas;

import br.com.aplicacao.inter.Forma;

public class Circulo implements Forma {
	
	private String cor;
	private Integer x;
	private Integer y ;
	private Integer raio;

	public Circulo(String cor) {
		this.cor = cor;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	public void setRaio(Integer raio) {
		this.raio = raio;
	}

	@Override
	public void desenhar() {
		System.out.println("Cor : " + cor + ", x : " + x + ", y :" + y + ", raio :" + raio);
	}

}

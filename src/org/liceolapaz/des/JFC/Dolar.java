package org.liceolapaz.des.JFC;

public class Dolar extends Moneda {
	private double cantidadE;
	
	
	public Dolar(double cantidad) {
		this.cantidadE = cantidad;
	}


	@Override
	public double cantidadEnEuros() {
		this.cantidadE *= 0.883509299;
		return cantidadE;
	}

}

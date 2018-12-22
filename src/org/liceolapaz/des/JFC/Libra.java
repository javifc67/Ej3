package org.liceolapaz.des.JFC;

public class Libra extends Moneda {
	private double cantidadE;
	
	
	public Libra(double cantidad) {
		this.cantidadE = cantidad;
	}


	@Override
	public double cantidadEnEuros() {
		this.cantidadE *= 1.1029861;
		return cantidadE;
	}

}

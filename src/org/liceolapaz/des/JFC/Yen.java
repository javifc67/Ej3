package org.liceolapaz.des.JFC;

public class Yen  extends Moneda {
	private double cantidadE;
	
	
	public Yen(double cantidad) {
		this.cantidadE = cantidad;
	}


	@Override
	public double cantidadEnEuros() {
		this.cantidadE *= 0.00779327499;
		return cantidadE;
	}

}

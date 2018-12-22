package org.liceolapaz.des.JFC;

import java.util.Scanner;

public class Conversor {
	private static Moneda cambio = null;
	public static void main(String[] args) {
		while (true) {
		menu ();
		int opcion = leerOpcion();
		
		switch (opcion) {
		case 0:
			System.exit(0);
			break;
		case 1:
			System.out.println("Escriba la cantidad de Dolares: ");
			cambio = new Dolar (cantidad());
			System.out.println("La cantidad en euros es: " + cambio.cantidadEnEuros());
			break;
		case 2:
			System.out.println("Escriba la cantidad de Libras: ");
			cambio = new Libra (cantidad());
			System.out.println("La cantidad en euros es: " + cambio.cantidadEnEuros());
			break;
		case 3:
			System.out.println("Escriba la cantidad de Yenes: ");
			cambio = new Yen (cantidad());
			System.out.println("La cantidad en euros es: " + cambio.cantidadEnEuros());
			break;
		default:
			System.out.println("Opcion incorrecta, introduzca un valor correcto");
		break;
		}
		}
	}

	private static double cantidad() {
		Scanner scan = new Scanner(System.in);
		return scan.nextDouble();
	}

	private static int leerOpcion() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}

	private static void menu() {
System.out.print("CONVERSOR DE MONEDAS" +
		"\r1. Dólares" +
		"\r2. Libras" +
		"\r3. Yens" +
		"\r0. Salir" +
		"\n\rEscoja una opción: ");		
	}

}

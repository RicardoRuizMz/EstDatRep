package fes.aragon.pruebas.pruebas;

import fes.aragon.utilerias.dinamicas.pila.Pila;

public class Inicio {

	public static void main(String[] args) throws Exception {
		Pila<Integer> pila = new Pila<>();
		String cadena = "34 54 +";
		String[] sigsCaracter = cadena.split(" ");
		int indice = 0;
		if (pila != null) {
			while (indice < sigsCaracter.length) {
				String simbolo = sigsCaracter[indice];
				if (!simbolo.equalsIgnoreCase("+")
						&& !simbolo.equalsIgnoreCase("-")
						&& !simbolo.equalsIgnoreCase("/")
						&& !simbolo.equalsIgnoreCase("*")) {
					pila.insertar(Integer.parseInt(simbolo));
				} else {
					try {
						float op1 = (float) pila.extraer();
						float op2 = (float) pila.extraer();
						if (simbolo.equalsIgnoreCase("+")) {
							float valor = op1 + op2;
							System.out.println("El resultado de la suma es: " + valor);
						} else if (simbolo.equalsIgnoreCase("-")) {
							float valor = op1 - op2;
							System.out.println("El resultado de la resta es: " + valor);
						} else if (simbolo.equalsIgnoreCase("*")) {
							float valor = op1 * op2;
							System.out.println("El resultado de la multiplicación es: " + valor);
						} else if (simbolo.equalsIgnoreCase("/")) {
							float valor = op1 / op2;
							System.out.println("El resultado de la división es: " + valor);
						}

					} catch (NumberFormatException e) {
						System.out.println(e.getMessage());
					}
				}
				indice++;
			}
		}


	}
}
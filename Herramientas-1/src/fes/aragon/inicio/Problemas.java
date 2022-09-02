package fes.aragon.inicio;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import componentes.computadora.Bocina;
import componentes.computadora.Monitor;
import componentes.computadora.Mouse;
import componentes.computadora.TarjetaGrafica;
import componentes.computadora.Teclado;
import computadora.computadora;
import fes.aragon.excep.IndiceFueraDeRango;
import fes.aragon.utilerias.estaticas.Arreglos;

public class Problemas {

	public static void main(String[] args) throws IndiceFueraDeRango {



		Arreglos<Integer> numeros = new Arreglos<>(100);
		
		int max = 99, min = 0;
	
		
		for (int i = 0; i < numeros.longitud(); i++) {
			numeros.asignar(i, (int) (Math.random() * (max - min + 1) + min));
		}

		
		try {
			numeros.imprime();

			System.out.println("El promedio es: " + numeros.promediar());
			System.out.println("El intervalo es: ");
			numeros.intervalo(5, 6);
			System.out.println("El maximo es: " + numeros.max());
			System.out.println("El numero segundo es: " + numeros.primyseg());
			System.out.println("El minimo es: " + numeros.min());

		} catch (IndiceFueraDeRango e) {
			// TODO: handle exception
			//numeros.imprime();

		}

	}
}
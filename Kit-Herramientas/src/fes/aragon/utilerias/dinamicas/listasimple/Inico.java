package fes.aragon.utilerias.dinamicas.listasimple;

public class Inico {
	public static void main(String[] args) {
		ListaSimple<Integer> datos = new ListaSimple<>();
		datos.agregarEnCabeza(34);
		datos.agregarEnCabeza(12);
		datos.agregarEnCabeza(90);
		datos.imprimirElementos();
	}
}

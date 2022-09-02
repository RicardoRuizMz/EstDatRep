package fes.aragon.utilerias.estaticas;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.Iterator;

import fes.aragon.excep.IndiceFueraDeRango;
/**
* Clase que tiene funciones para ocupar arreglos de tipo Integer
* 
* @author mash
*
*/
/*<E> Arreglo genérico*/
public class Arreglos<E> {

	private int indice = 0;
	private int indiceSiguiente = -1;
	private final Object[] l;   /*<private final> Constante*/
	public Arreglos(int numeroElementos) {
		this.l = new Object[numeroElementos];
		/*this hace referencia al atributo l*/
	}

	/**
	 * Método que inserta un valor de tipo Integer consecutivo
	 *
	 * @param x es el parámetro que se recibe para agregar a la lista
	 * @throws IndiceFueraDeRango exepción que pasa cuando nos salimos fuera del
	 *                            índice
	 */
	/*Esta inserta un elemento E en el arreglo l*/
	public void insertar(E x) throws IndiceFueraDeRango {
		if (indice < l.length) {
			l[indice] = x;
			indice++;
		} else {
			throw new IndiceFueraDeRango("Indice fuera de rango");
		}
	}

	/**
	 * Método que localiza un valor en la lista, retornan el indice
	 * 
	 * @param x valor Integer que se busca en la lista
	 * @return se retorna -1 si no esta el valor de la lista, en caso contrario se
	 *         retorna el indice
	 */
	/*Devuelve la posición del elemento E en el arreglo l*/
	public Integer localiza(E x) {
		for (int i = 0; i < l.length; i++) {
			if (l[i].equals(x)) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Método que recupera un elemento en el indice indicado
	 * 
	 * @param promedio entero que indica el indice del elemento a devolver
	 * @return E que se retorna, tomando la posición siguiente que se da como
	 *         parametro
	 * @throws IndiceFueraDeRango excepción que se arroja cuando el indice p esta
	 *                            fuera de los rangos del arreglo
	 */
	/* Devuelve el elemento E de la posición p en el arreglo l*/
	public E recupera(int p) throws IndiceFueraDeRango {
		if (p >= l.length || p < 0) {
			throw new IndiceFueraDeRango("Indice fuera de rango");
		} else {
			@SuppressWarnings("unchecked")
			final E e = (E) l[p];
			return e;
		}
	}

	/**
	 * Método que alimina un elemento en el indice indicado
	 * 
	 * @param p entero que indica el indice del elemento a eliminar
	 * @throws IndiceFueraDeRango excepción que se arroja cuando el indice p esta
	 *                            fuera de los rangos del arreglo
	 */
	/*Elimina el elemento E de la posición p en el arreglo l*/
	public void suprime(int p) throws IndiceFueraDeRango {
		if (p >= l.length || p <= 0) {
			throw new IndiceFueraDeRango("Indice fuera de rango");
		} else {
			l[p] = null;
		}
	}

	/**
	 * Método que da el elemento siguiente de la posición que nos indica
	 * 
	 * @param p entero que indica el indice del elemento a devolver
	 * @return E que se retorna, tomando la posición siguiente que se da como
	 *         parametro
	 * @throws IndiceFueraDeRango excepción que se arroja cuando el indice p esta
	 *                            fuera de los rangos del arreglo
	 */
	/*Devuelve el valor siguiente de la posición p en el arreglo l*/
	public E siguiente(int p) throws IndiceFueraDeRango {
		if (p >= l.length || p <= -1) {
			throw new IndiceFueraDeRango("Indice fuera de rango");
		}
		@SuppressWarnings("unchecked")
		final E e = (E) l[p + 1];
		return e;
	}
	
	public E siguiente() throws IndiceFueraDeRango {
		this.indiceSiguiente += 1;
		if (this.indiceSiguiente == l.length ) {
			throw new IndiceFueraDeRango("Ya no hay elementos");
		}
		@SuppressWarnings("unchecked")
		final E e = (E) l[this.indiceSiguiente];
		return e;
	}
	
	
	/**
	 * Método que da el elemento anterior de la posición que nos indica
	 * 
	 * @param p entero que indica el indice del elemento a devolver
	 * @return Integer que se retorna Integer tomando la posición anterior que se da
	 *         como parametro
	 * @throws IndiceFueraDeRango excepción que se arroja cuando el indice p esta
	 *                            fuera de los rangos del arreglo
	 */
	public E anterior(int p) throws IndiceFueraDeRango {
		if (p >= l.length || p <= 0) {
			throw new IndiceFueraDeRango("Indice fuera de rango");
		}
		@SuppressWarnings("unchecked")
		final E e = (E) l[p - 1];
		return e;
	}

	/**
	 * Método que limpia el arreglo de Enteros
	 * 
	 */
	public void limpiar() {
		for (int i = 0; i < l.length; i++) {
			l[i] = null;
		}
	}

	/**
	 * Método que regresa el primer elemento del arreglo, si no existe regresa un
	 * null
	 * 
	 * @return retorna E o null del primer elemento del arreglo
	 */
	public E primero() {
		@SuppressWarnings("unchecked")
		final E e = (E) l[0];
		return e;
	}

	/**
	 * Método que devuelve la longitud del arreglo
	 * 
	 * @return un entero que es la longitud del arreglo
	 */
	public Integer longitud() {
		return l.length;
	}

	/**
	 * Método que imprime todos los valores del arreglo
	 */
	public void imprime() {
		for (int i = 0; i < l.length; i++) {
			System.out.print(l[i] + " ");
		}
		System.out.println();
	}

	/**
	 * Método que asignara un valor en la posición indicada
	 * 
	 * @param p entero que indica la posición donde se inserta el valor en el
	 *          arreglo
	 * @param x valor que se insertara en la posicion que se indica en p
	 * @throws IndiceFueraDeRango exepción que sucede cuando no estamos en el rango
	 *                            del arreglo
	 */
	public void asignar(int p, E x) throws IndiceFueraDeRango {
		if (p > l.length || p < 0) {
			throw new IndiceFueraDeRango("Indice fuera de rango");
		} else {
			l[p] = x;
		}
	}
	

	/**
	 * Método pr sacar el promedio
	 * @return
	 */
     public int promediar() {
		
	    int total = 0;
        int res = 0;
		for (int i = 0; i < l.length; i++) {
			total += (int) l[i];
			
		}
		res = total/l.length;
		return res;
		
	}
	
	 
     /**
      * Método para calcular el promedio
      * @param a
      * @param b
      * @throws IndiceFueraDeRango
      */
	public void intervalo(int a, int b) throws IndiceFueraDeRango {
		if (a < 0 || b >= l.length || a > b || a == b) {
			throw new IndiceFueraDeRango("Indice fuera de rango");
		}

		for (int i = a; i < b; i++) {
			System.out.print(l[i] + " ");
		}

		System.out.println();
	}

	/**
	 * Método para calcular el máximo del intervalo
	 * @return
	 */
	public Integer max() {
		Integer tmp=null;
		Integer aux= 0;
		for (int i = 0; i < l.length; i++) {
			tmp=(Integer) l[i];
			if (tmp>aux) {
				aux=tmp;
				
			}
		}
		return aux;
		
	}
	/**
	 * Método para calcular el máximo del intervalo
	 * @return
	 */
	public Integer primyseg() {
		Integer tmp=null;
		Integer aux= 0;
		Integer seg=0;
		int i=0;
		while ( i < l.length) {
			tmp=(Integer) l[i];
			if (tmp>aux) {
				seg=aux;
				aux=tmp;
				
			} 
			i++;}
		return seg;
		
	}
	
	
	
	
	
	/**
	 * Método para calcular el mínimo del intervalo
	 * 
	 * @return
	 */
	public Integer min() {
		Integer tmp = null;
		Integer aux = 99;
		for (int i = 0; i < l.length; i++) {
			tmp = (Integer) l[i];
			if (tmp < aux) {
				aux = tmp;

			}
		}
		return aux;

	}

}
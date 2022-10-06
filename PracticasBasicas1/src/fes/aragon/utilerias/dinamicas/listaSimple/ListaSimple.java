package fes.aragon.utilerias.dinamicas.listaSimple;

/**
 * Clase que maneja Listas Simples Los Indices se manejan apartir del numero 0,
 * es decir, el primer elemento tiene indice 0
 * 
 * 
 *
 * @param <E>
 */
public class ListaSimple<E> {

	protected Nodo<E> cabeza, cola;
	protected int longitud = 0;

	/**
	 * Constructor
	 */
	public ListaSimple() {

		cabeza = cola = null;
	}

	/*------------METODOS QUE AGREGAN NODOS------------*/

	/**
	 * Metodo que agrega un nodo a la cabeza de la lista y aumenta la longitud.
	 * 
	 * @param dato, dato que guarda el dato creado en la cabeza
	 */
	public void agregarEnCabeza(E dato) {

		cabeza = new Nodo<E>(dato, cabeza);
		if (cola == null) {
			cola = cabeza;
		}
		longitud++;

	}

	/**
	 * Metodo que agrega un elemento a la cola de la lista. Aumenta la longitud
	 * 
	 * @param dato
	 */
	public void agregarEnCola(E dato) {
		if (cola == null) {
			cabeza = new Nodo<E>(dato, null);
			cola = cabeza;
			longitud++;
		} else {

			cola.setSiguiente(new Nodo<E>(dato, null));
			cola = cola.getSiguiente();
			longitud++;

		}
	}

	/**
	 * Metodo que inserta un nuevo nodo en la lista en la posicion indicada Retorna
	 * verdadero si el nodo se inserto con exito, o falso de lo contrario Falso: si
	 * el indice dado esta fuera de rango de la lista.
	 * 
	 * @param dato   Dato que se inserta en el nuevo nodo
	 * @param indice Indica la posicion en la lista del nuevo nodo
	 * @return Boolean
	 */

	public boolean insertarNodo(E dato, int indice) {

		boolean insert = false;

		if (indice >= 0 && indice <= longitud - 1) {

			if (indice == 0) {
				this.agregarEnCabeza(dato);
				insert = true;
			} else {

				Nodo<E> prv, tmp = null;
				int i = 0;
				for (prv = null, tmp = cabeza; i < indice; i++, prv = tmp, tmp = tmp.getSiguiente())
					;

				prv.setSiguiente(new Nodo<E>(dato, tmp));
				longitud++;
				insert = true;

			}

		}

		return insert;
	}

	// Agregar despues de X posicion (PENDIENTE)

	/*------------METODOS QUE ELIMINAN NODOS------------*/

	/**
	 * Metodo que elimina la cabeza de la lista, sin perder referencia de los
	 * siguientes nodos.
	 */
	public void eliminarCabeza() {

		if (cabeza != null) {

			if (cabeza == cola) {
				cabeza = cola = null;
				longitud--;
			} else {
				cabeza = cabeza.getSiguiente();
				longitud--;
			}

		}

	}

	/**
	 * Metodo que elimina la cola de la lista
	 */
	public void eliminarCola() {

		if (cabeza != null) {

			if (cabeza == cola) {
				cabeza = cola = null;
				longitud--;
			} else {
				Nodo<E> tmp;

				for (tmp = cabeza; tmp.getSiguiente() != cola; tmp = tmp.getSiguiente())
					;

				tmp.setSiguiente(null);
				cola = tmp;
				longitud--;

			}

		}

	}

	/**
	 * Elimina el dato de una lista
	 * 
	 * @param dato Dato a eliminar
	 * @return retorna true si se eliminó, false si no se encontro el dato en la
	 *         lista
	 */
	public boolean eliminar(E dato) {

		boolean del = false;

		if (cabeza != null) {
			if (cabeza == cola && dato.equals(cabeza.getDato())) {
				cabeza = cola = null;
				del = true;
				longitud--;
			} else if (dato == cabeza.getDato()) {
				cabeza = cabeza.getSiguiente();
				del = true;
				longitud--;
			} else {
				Nodo<E> prd, tmp;
				for (prd = cabeza, tmp = cabeza.getSiguiente(); tmp != null
						&& !tmp.getDato().equals(dato); prd = prd.getSiguiente(), tmp = tmp.getSiguiente())
					;

				if (tmp != null) {
					del = true;
					longitud--;
					prd.setSiguiente(tmp.getSiguiente());
					if (tmp == cola) {
						cola = prd;
					}
				}
			}
		}

		return del;
	}

	/**
	 * Elimina el nodo del indice especificado
	 * 
	 * @param indice Indice a eliminar
	 * @return true: Si se a eliminado con exito, false: Indice fuera de rango
	 */
	public boolean eliminarEnIndice(int indice) {

		boolean del = false;

		if (indice >= 0 && indice <= longitud - 1) {
			if (cabeza != null) {
				if (cabeza == cola && indice == 0) {
					cabeza = cola = null;
					del = true;
					longitud--;
				} else if (indice == 0) {
					cabeza = cabeza.getSiguiente();
					del = true;
					longitud--;
				} else {
					Nodo<E> prd, tmp;
					int i = 1;
					for (prd = cabeza, tmp = cabeza.getSiguiente(); i < indice; prd = prd.getSiguiente(), tmp = tmp
							.getSiguiente(), i++)
						;

					if (tmp != null) {
						del = true;
						longitud--;
						prd.setSiguiente(tmp.getSiguiente());
						if (tmp == cola) {
							cola = prd;
						}
					}

				}
			}
		}

		return del;
	}

	/*------------METODOS DE ASIGNACIÓN------------*/

	/**
	 * Metodo que asigna un dato en el indice indicado
	 * 
	 * @param dato   dato a asignar
	 * @param indice posicion del nodo
	 * @return false: Indice fuera de rango; true: dato asignado;
	 */
	public boolean asignar(E dato, int indice) {
		Nodo<E> tmp = null;

		if (indice <= longitud - 1) {
			tmp = cabeza;
			for (int i = 0; i < indice && tmp != null; i++, tmp = tmp.getSiguiente())
				;
		}

		if (tmp != null) {
			tmp.setDato(dato);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Metodo que asigna un nuevo dato, en todos los nodos que contengan un dato a
	 * especificar
	 * 
	 * @param dato      Dato a buscar en los nodos
	 * @param nuevoDato nuevo Dato a Asignar en los nodos
	 * @param todos     True: para asignar el nuevo dato en todos los nodos que
	 *                  encuentre el dato a especificar; False: para solo cambiar el
	 *                  dato en el primer Nodo que encuentre con el dato a
	 *                  especificar
	 */
	public void asignar(E dato, E nuevoDato, boolean todos) {

		Nodo<E> tmp = null;
		if (!todos) {
			for (tmp = cabeza; tmp != null; tmp = tmp.getSiguiente()) {
				if (tmp.getDato().equals(dato)) {
					tmp.setDato(nuevoDato);
					return;
				}
			}
		} else {
			for (tmp = cabeza; tmp != null; tmp = tmp.getSiguiente()) {
				if (tmp.getDato().equals(dato)) {
					tmp.setDato(nuevoDato);
				}
			}
		}

	}

	/*------------METODOS EXTRAS------------*/

	/**
	 * Metodo que imprime los elementos de la lista
	 */
	public void imprimirElementos() {
		for (Nodo<E> tmp = cabeza; tmp != null; tmp = tmp.getSiguiente()) {
			System.out.println(tmp.getDato());
		}
	}

	/**
	 * Metodo para obtener el dato del nodo a indicar
	 * 
	 * @param indice posicion del nodo a obtener el dato
	 * @return retorna el dato del nodo especificado, retorna null si el indice esta
	 *         fuera de rango
	 */
	public E obtenerDato(int indice) {

		Nodo<E> tmp = null;
		if (indice <= longitud || indice < 0) {
			tmp = cabeza;
			for (int i = 0; i < indice && tmp != null; i++, tmp = tmp.getSiguiente())
				;
		}

		if (tmp != null) {
			return tmp.getDato();
		} else {
			return null;
		}

	}

	/**
	 * Metodo para obtener el dato del nodo a indicar
	 * 
	 * @param indice posicion del nodo a obtener el dato
	 * @return retorna el dato del nodo especificado, retorna null si el indice esta
	 *         fuera de rango
	 */
	public Nodo<E> obtenerNodo(int indice) {

		Nodo<E> tmp = null;
		if (indice <= longitud || indice < 0) {
			tmp = cabeza;
			for (int i = 0; i < indice && tmp != null; i++, tmp = tmp.getSiguiente())
				;
		}

		if (tmp != null) {
			return tmp;
		} else {
			return null;
		}

	}

	/**
	 * Metodo que busca en la lista el dato a especificar
	 * 
	 * @param dato Dato a buscar en la lista
	 * @return retorna la posicion del nodo del dato a buscar, retorna -1 si no se
	 *         encontro
	 */
	@SuppressWarnings("unused")
	public int buscar(E dato) {
		int indice;
		boolean encontrado = false;
		Nodo<E> tmp = null;
		tmp = cabeza;
		if (longitud == 0) {
			return -1;
		}
		for (indice = 0; tmp != null; indice++, tmp = tmp.getSiguiente()) {
			if (tmp.getDato().equals(dato)) {
				encontrado = true;
				break;
			}
		}

		if (encontrado == true) {
			return indice;
		} else {
			return -1;
		}
	}

	public E getCabeza() {
		return cabeza.getDato();
	}

	public void setCabeza(Nodo<E> cabeza) {
		this.cabeza = cabeza;
	}

	public E getCola() {
		return cola.getDato();
	}

	public void setCola(Nodo<E> cola) {
		this.cola = cola;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public boolean esVacia() {
		// TODO Auto-generated method stub
		return cabeza == null;
	}

}

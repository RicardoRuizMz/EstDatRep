package componentes.computadora;

public class TarjetaGrafica {
	
	private String marca;
	private int modelo;
	private String capacidad;
	private String frecuencia;

	public TarjetaGrafica() {
	}

	public TarjetaGrafica(String marca, int modelo, String capacidad, String frecuencia) {
		this.marca = marca;
		this.modelo = modelo;
		this.capacidad = capacidad;
		this.frecuencia = frecuencia;
	}

	public String getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(String frecuencia) {
		this.frecuencia = frecuencia;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public String getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "TarjetaGrafica{" + "marca=" + marca + ", modelo=" + modelo + ", capacidad=" + capacidad
				+ ", frecuencia=" + frecuencia + '}';
	}

}
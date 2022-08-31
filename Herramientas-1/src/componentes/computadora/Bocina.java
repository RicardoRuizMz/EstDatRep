package componentes.computadora;

public class Bocina {

	private String marca;
	private String modelo;
	private int pulgadas;

	public Bocina() {
	}

	public Bocina(String marca, String modelo, int pulgadas) {
		this.marca = marca;
		this.modelo = modelo;
		this.pulgadas = pulgadas;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Bocina{" + "marca=" + marca + ", modelo=" + modelo + ", pulgadas=" + pulgadas + '}';
	}

}

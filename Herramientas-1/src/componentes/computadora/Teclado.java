package componentes.computadora;

public class Teclado {
	
	private String marca;
	private String color;
	private int teclas;

	public Teclado() {
	}

	public Teclado(String marca, String color, int teclas) {
		this.marca = marca;
		this.color = color;
		this.teclas = teclas;
	}

	public int getTeclas() {
		return teclas;
	}

	public void setTeclas(int teclas) {
		this.teclas = teclas;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Teclado{" + "marca=" + marca + ", color=" + color + ", teclas=" + teclas + '}';
	}

}
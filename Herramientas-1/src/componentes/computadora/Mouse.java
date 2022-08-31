package componentes.computadora;

public class Mouse {

	private String marca;
	private String color;
	private String tipo;

	public Mouse() {
	}

	public Mouse(String marca, String color, String tipo) {
		this.marca = marca;
		this.color = color;
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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
		return "Mouse{" + "marca=" + marca + ", color=" + color + ", tipo=" + tipo + '}';
	}

}
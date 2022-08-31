package computadora;

import componentes.computadora.Bocina;
import componentes.computadora.Monitor;
import componentes.computadora.Mouse;
import componentes.computadora.TarjetaGrafica;
import componentes.computadora.Teclado;

public class computadora {
	
	private String marca;
    private String modelo;
    private Monitor pantalla;
    private Teclado teclado;
    private Mouse raton;
    private TarjetaGrafica tarjetaGrafica;
    private Bocina bocina;
    
   public computadora() {
	// TODO Auto-generated constructor stub
   }

   public computadora(String marca, String modelo, Monitor pantalla, Teclado teclado, Mouse raton, TarjetaGrafica tarjetaGrafica, Bocina bocina) {
        this.marca = marca;
        this.modelo = modelo;
        this.pantalla = pantalla;
        this.teclado = teclado;
        this.raton = raton;
        this.tarjetaGrafica = tarjetaGrafica;
        this.bocina = bocina;
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

    public Monitor getPantalla() {
        return pantalla;
    }

    public void setPantalla(Monitor pantalla) {
        this.pantalla = pantalla;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Mouse getRaton() {
        return raton;
    }

    public void setRaton(Mouse raton) {
        this.raton = raton;
    }

    public TarjetaGrafica getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(TarjetaGrafica tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public Bocina getBocina() {
        return bocina;
    }

    public void setBocina(Bocina bocina) {
        this.bocina = bocina;
    }
    
   @Override
    public String toString() {
        return "Computadora{" + "Marca = " + marca + ", Modelo = " + modelo + ", Bocina = " + bocina + ", Pantalla = " + pantalla + ", Raton = " + raton + ", Tarjeta Gráfica = " + tarjetaGrafica + ", Teclado = " + teclado + '}';
    }
    

}
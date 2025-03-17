package clases;

public class Cine {
	public int aforo;
	public int butacasOcupadas;
	public String tituloPelicula;
	public int precioEntrada;
	public Cine() {
		super();
	}
	public Cine(int aforo) {
		super();
		this.aforo = aforo;
	}
	public Cine(int aforo, String tituloPelicula, int precioEntrada) {
		super();
		this.aforo = aforo;
		this.tituloPelicula = tituloPelicula;
		this.precioEntrada = precioEntrada;
		aforo = 100;
		butacasOcupadas = 0;
		tituloPelicula = "Sin determinar";
		precioEntrada = 5;
	}

	public int getAforo() {
		return aforo;
	}
	public void setAforo(int aforo) {
		this.aforo = aforo;
	}
	public int getButacasOcupadas() {
		return butacasOcupadas;
	}
	public void setButacasOcupadas(int butacasOcupadas) {
		this.butacasOcupadas = butacasOcupadas;
	}
	public String getTituloPelicula() {
		return tituloPelicula;
	}
	public void setTituloPelicula(String tituloPelicula) {
		this.tituloPelicula = tituloPelicula;
	}
	public int getPrecioEntrada() {
		return precioEntrada;
	}
	public void setPrecioEntrada(int precioEntrada) {
		this.precioEntrada = precioEntrada;
	}
}

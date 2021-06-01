package ar.edu.unlam.pb2.vehiculos;

public class Tren extends Vehiculo{

	private Integer cantidadDeVagones;
	private Integer cantidadDePasajerosPorVagon;
	private Integer velocidadMaxima;

	public Tren(Integer cantidadDeVagones, Integer cantidadDePasajerosPorVagon, Integer velocidadMaxima, Double latitud, Double longitud) {
		super(latitud, longitud);
		this.cantidadDeVagones = cantidadDeVagones;
		this.cantidadDePasajerosPorVagon = cantidadDePasajerosPorVagon;
		this.velocidadMaxima = velocidadMaxima;

	}

	public Integer getCantidadDeVagones() {
		// TODO Auto-generated method stub
		return cantidadDeVagones;
	}

	public Integer getCantidadDePasajerosPorVagon() {
		// TODO Auto-generated method stub
		return cantidadDePasajerosPorVagon;
	}

	public Integer getVelocidadMaxima() {
		// TODO Auto-generated method stub
		return velocidadMaxima;
	}


}

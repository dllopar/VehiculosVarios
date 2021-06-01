package ar.edu.unlam.pb2.vehiculos;

public class Moto extends Vehiculo{

	private Integer velocidadMaxima;
	private String patente;
	private final Integer CANTIDAD_MAXIMA_DE_PASAJEROS;

	public Moto(String patente, Integer velocidadMaxima, Double latitud, Double longitud) {
		super(latitud, longitud);
		this.patente = patente;
		this.velocidadMaxima = velocidadMaxima;
		CANTIDAD_MAXIMA_DE_PASAJEROS=2;
		
	}

	public String getPatente() {
		// TODO Auto-generated method stub
		return patente;
	}

	public Integer getCANTIDAD_MAXIMA_DE_PASAJEROS() {
		// TODO Auto-generated method stub
		return CANTIDAD_MAXIMA_DE_PASAJEROS;
	}

	public Integer getVelocidadMaxima() {
		// TODO Auto-generated method stub
		return velocidadMaxima;
	}

}

package ar.edu.unlam.pb2.vehiculos;

public class Auto extends Vehiculo {

	private String patente;
	private Integer cantidadMaximaDePasajeros;
	private Integer velocidadMaxima;

	public Auto(String patente, Integer cantidadMaximaDePasajeros, Integer velocidadMaxima, Double latitud, Double longitud) {
		super(latitud, longitud);
		this.patente = patente;
		this.cantidadMaximaDePasajeros = cantidadMaximaDePasajeros;
		this.velocidadMaxima = velocidadMaxima;
		
	}
	
	

	public String getPatente() {
		// TODO Auto-generated method stub
		return patente;
	}

	public Integer getCantidadMaximaDePasajeros() {
		// TODO Auto-generated method stub
		return cantidadMaximaDePasajeros;
	}

	public Integer getVelocidadMaxima() {
		// TODO Auto-generated method stub
		return velocidadMaxima;
	}


}

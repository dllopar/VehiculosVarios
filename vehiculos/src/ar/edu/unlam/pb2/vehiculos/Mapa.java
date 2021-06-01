package ar.edu.unlam.pb2.vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Mapa {

	private String nombreMapa;
	private List<Vehiculo> vehiculos;

	public Mapa(String nombreMapa) {
		this.nombreMapa = nombreMapa;
		vehiculos = new ArrayList<>();
	}

	public void agregarVehiculo(Auto auto) {
		vehiculos.add(auto);

	}

	public void agregarVehiculo(Moto moto) {
		vehiculos.add(moto);
	}

	public void agregarVehiculo(Bicicleta bicicleta) {
		vehiculos.add(bicicleta);

	}

	public void agregarVehiculo(Tren tren) {
		vehiculos.add(tren);
	}

	public Integer getCantidadDeVehiculos() {

		return vehiculos.size();
	}

	public Boolean hayCoalicion() throws ColitionException {
		Boolean hayColicion = false;

		for (Vehiculo vehiculo : vehiculos) {
			for (Vehiculo vehiculo2 : vehiculos) {
				if (!vehiculo.equals(vehiculo2)) {
					if (vehiculo.getLatitud().equals(vehiculo2.getLatitud())
							&& vehiculo.getLongitud().equals(vehiculo2.getLongitud())) {
						throw new ColitionException();
					}
				}
			}
		}
		return hayColicion;
	}

	public void agregarVehiculo(Vehiculo vehiculoNuevo) {

		vehiculos.add(vehiculoNuevo);

	}

}

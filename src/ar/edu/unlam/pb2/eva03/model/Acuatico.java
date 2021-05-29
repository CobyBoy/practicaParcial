package ar.edu.unlam.pb2.eva03.model;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeVehiculo;

public class Acuatico extends Vehiculo {
	private Double profundidad;

	public Acuatico(Integer id, String nombreDeModelo) {
		super(id, nombreDeModelo);
		this.profundidad = 0.0;
	}

	public Double getProfundidad() {
		return profundidad;
	}

	@Override
	public String getTipoDeVehiculo() {
		return TipoDeVehiculo.ACUATICO.getTipoDeVehiculo();
	}

}

package ar.edu.unlam.pb2.eva03.models;

import ar.edu.unlam.pb2.eva03.enums.TipoDeVehiculo;
import ar.edu.unlam.pb2.eva03.interfaces.ITerrestre;

public class Anfibio extends Acuatico implements ITerrestre{
	
	private Double velocidad;

	public Anfibio(Integer id, String modelo) {
		super(id, modelo);
		this.velocidad = 0.0;
	}

	@Override
	public Double getVelocidad() {
		// TODO Auto-generated method stub
		return velocidad;
	}
}

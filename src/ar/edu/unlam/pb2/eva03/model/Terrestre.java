package ar.edu.unlam.pb2.eva03.model;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeVehiculo;

public class Terrestre extends Vehiculo {
	private Double velocidad;
	
	public Terrestre(Integer id, String nombreDeModelo) {
		super(id, nombreDeModelo);
		this.velocidad = 0.0;
	}

	public double getVelocidad() {
		return velocidad;
	}

	@Override
	public String getTipoDeVehiculo() {
		// TODO Auto-generated method stub
		return TipoDeVehiculo.TERRESTRE.getTipoDeVehiculo();
	}

}

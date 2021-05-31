package ar.edu.unlam.pb2.eva03.models;

import ar.edu.unlam.pb2.eva03.enums.TipoDeVehiculo;
import ar.edu.unlam.pb2.eva03.interfaces.ITerrestre;

public class Terrestre extends Vehiculo implements ITerrestre{
	private Double velocidad;
	
	public Terrestre(Integer id, String nombreDeModelo) {
		super(id, nombreDeModelo);
		this.velocidad = 0.0;
	}

	

	@Override
	public String getTipoDeVehiculo() {
		// TODO Auto-generated method stub
		return TipoDeVehiculo.TERRESTRE.getTipoDeVehiculo();
	}



	@Override
	public Double getVelocidad() {
		// TODO Auto-generated method stub
		return velocidad;
	}



	@Override
	public int compareTo(Vehiculo vehiculo) {
		return Integer.valueOf(this.id).compareTo(vehiculo.getId());
	}

}

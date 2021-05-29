package ar.edu.unlam.pb2.eva03.model;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeVehiculo;

public class Portaviones extends Vehiculo {

	public Portaviones(Integer id, String nombreDeModelo) {
		super(id, nombreDeModelo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getTipoDeVehiculo() {
		// TODO Auto-generated method stub
		return TipoDeVehiculo.ACUATICO.getTipoDeVehiculo();
	}

}

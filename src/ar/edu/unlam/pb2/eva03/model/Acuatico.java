package ar.edu.unlam.pb2.eva03.model;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeVehiculo;
import ar.edu.unlam.pb2.eva03.interfaces.IAcuatico;

public class Acuatico extends Vehiculo implements IAcuatico{
	private Double profundidad;

	public Acuatico(Integer id, String nombreDeModelo) {
		super(id, nombreDeModelo);
		this.profundidad = 0.0;
	}

	@Override
	public Double getProfundidad() {
		return profundidad;
	}

	@Override
	public String getTipoDeVehiculo() {
		return TipoDeVehiculo.ACUATICO.getTipoDeVehiculo();
	}

}

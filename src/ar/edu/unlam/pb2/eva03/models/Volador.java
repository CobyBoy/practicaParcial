package ar.edu.unlam.pb2.eva03.models;

import ar.edu.unlam.pb2.eva03.enums.TipoDeVehiculo;
import ar.edu.unlam.pb2.eva03.interfaces.IVolador;

public class Volador extends Vehiculo implements IVolador{
	private Double altura;

	public Volador(Integer id, String modelo) {
		super(id, modelo);
		this.altura = 0.0;
	}

	@Override
	public Double getAltura() {
		return altura;
	}

	@Override
	public String getTipoDeVehiculo() {
		// TODO Auto-generated method stub
		return TipoDeVehiculo.VOLADOR.getTipoDeVehiculo();
	}

	@Override
	public int compareTo(Vehiculo vehiculo) {
		return Integer.valueOf(this.id).compareTo(vehiculo.getId());
	}

}

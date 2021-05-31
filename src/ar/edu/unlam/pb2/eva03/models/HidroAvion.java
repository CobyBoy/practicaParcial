package ar.edu.unlam.pb2.eva03.models;

import ar.edu.unlam.pb2.eva03.interfaces.IVolador;

public class HidroAvion extends Acuatico implements IVolador {
	private Double altura;
	
	public HidroAvion(Integer id, String modelo) {
		super(id, modelo);
		this.altura = 0.0;
	}

	@Override
	public Double getAltura() {
		// TODO Auto-generated method stub
		return altura;
	}

}

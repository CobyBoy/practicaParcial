package ar.edu.unlam.pb2.eva03.model;

public class Avion extends Volador {

	public Avion(Integer id, String modelo) {
		super(id, modelo);
	}

	@Override
	public String toString() {
		return "Avion [getId()=" + getId() + ", getNombreDeModelo()=" + getNombreDeModelo() + "]";
	}

}

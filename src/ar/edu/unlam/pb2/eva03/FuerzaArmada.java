package ar.edu.unlam.pb2.eva03;

import java.util.LinkedList;
import java.util.List;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;
import ar.edu.unlam.pb2.eva03.model.Vehiculo;

public class FuerzaArmada {

	private List<Vehiculo> convoy;
	private List<Batalla> batallas;
	
	public FuerzaArmada() {
		this.convoy = new LinkedList<Vehiculo>();
		this.batallas = new LinkedList<Batalla>();
	}
	
	public void agregarVehiculo(Vehiculo vehiculo) {
		if(!this.convoy.contains(vehiculo)) {
			this.convoy.add(vehiculo);
		}	
	}

	public Integer getCapacidadDeDefensa() {
		return this.convoy.size();
	}

	public void crearBatalla(String nombreDeBatalla, TipoDeBatalla tipo, Double latitud, Double longitud) {
		Batalla batalla = new Batalla(nombreDeBatalla, tipo, latitud, longitud);
		this.batallas.add(batalla);
	}

	public Batalla getBatalla(String nombreDeBatalla) {
		for (Batalla batalla : this.batallas) {
			if (batalla.getNombre().equals(nombreDeBatalla)) {
			return batalla;
			}
		}
		return null;
	}

	public boolean enviarALaBatalla(String nombreDeBatalla, Integer idDeVehiculo) {
		Batalla  batalla = this.getBatalla(nombreDeBatalla);
		Boolean aptoParaBatalla = Boolean.FALSE;
		for (Vehiculo vehiculo : this.convoy) {
			if (vehiculo.getId().equals(idDeVehiculo) && 
					vehiculo.getTipoDeVehiculo().equalsIgnoreCase(batalla.getTipo().name())) {
					aptoParaBatalla = Boolean.TRUE;
					return aptoParaBatalla;
			}
		}
		return aptoParaBatalla;
	}

	@Override
	public String toString() {
		return "FuerzaArmada [convoy=" + convoy + ", batallas=" + batallas + "]";
	} 

}

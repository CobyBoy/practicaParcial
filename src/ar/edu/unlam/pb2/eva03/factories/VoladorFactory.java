package ar.edu.unlam.pb2.eva03.factories;

import ar.edu.unlam.pb2.eva03.enums.TipoDeVolador;
import ar.edu.unlam.pb2.eva03.models.Avion;
import ar.edu.unlam.pb2.eva03.models.HidroAvion;
import ar.edu.unlam.pb2.eva03.models.Vehiculo;
import ar.edu.unlam.pb2.eva03.models.Volador;

public class VoladorFactory {

	public Volador crearTipoDeVolador(String tipo, Integer id, String modelo) {
		if (tipo.equalsIgnoreCase(TipoDeVolador.AVION.getTipoDeVolador())) {
			return new Avion(id, modelo);
		}
		return null;
	}

}

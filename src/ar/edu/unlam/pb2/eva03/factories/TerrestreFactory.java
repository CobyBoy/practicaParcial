package ar.edu.unlam.pb2.eva03.factories;

import ar.edu.unlam.pb2.eva03.enums.TipoDeTerrestre;
import ar.edu.unlam.pb2.eva03.models.Tanque;
import ar.edu.unlam.pb2.eva03.models.Terrestre;

public class TerrestreFactory {
	public Terrestre crearTipoDeTerrestre(String tipo, Integer id, String modelo) {
		if (tipo.equalsIgnoreCase(TipoDeTerrestre.TANQUE.getTipoDeTerrestre())) {
			return new Tanque(id, modelo);
		}
		else
			if (tipo.equalsIgnoreCase(TipoDeTerrestre.CAMION.getTipoDeTerrestre())) {
			return new Tanque(id, modelo);
		}
		return null;
	}
}

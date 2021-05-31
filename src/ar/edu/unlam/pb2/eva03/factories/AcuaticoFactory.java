package ar.edu.unlam.pb2.eva03.factories;

import ar.edu.unlam.pb2.eva03.enums.TipoDeAcuatico;
import ar.edu.unlam.pb2.eva03.models.Acuatico;
import ar.edu.unlam.pb2.eva03.models.Anfibio;
import ar.edu.unlam.pb2.eva03.models.Destructor;
import ar.edu.unlam.pb2.eva03.models.Portaviones;
import ar.edu.unlam.pb2.eva03.models.Submarino;

public class AcuaticoFactory {
	public Acuatico crearTipoDeAcuatico(String tipo, Integer id, String modelo) {
		
		if (tipo.equalsIgnoreCase(TipoDeAcuatico.SUBMARINO.getTipoDeAcuatico())) {
			return new Submarino(id, modelo);
		}
		else 
			if (tipo.equalsIgnoreCase(TipoDeAcuatico.HIDROAVION.getTipoDeAcuatico())) {
				return new Portaviones(id, modelo);
			}
		else 
			if (tipo.equalsIgnoreCase(TipoDeAcuatico.PORTAVIONES.getTipoDeAcuatico())) {
				return new Portaviones(id, modelo);
			}
		else 
			if (tipo.equalsIgnoreCase(TipoDeAcuatico.ANFIBIO.getTipoDeAcuatico())) {
				return new Anfibio(id, modelo);
			}
		else 
			if (tipo.equalsIgnoreCase(TipoDeAcuatico.DESTRUCTOR.getTipoDeAcuatico())) {
				return new Destructor(id, modelo);
			}
		return null;
	}
}

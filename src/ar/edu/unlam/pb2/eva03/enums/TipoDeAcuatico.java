package ar.edu.unlam.pb2.eva03.enums;

public enum TipoDeAcuatico {
	SUBMARINO("Submarino"), 
	PORTAVIONES("Portaviones"), 
	DESTRUCTOR("Destructor"), 
	ANFIBIO("Anfibio"), HIDROAVION("Hidroavion");
	
	private String tipo;
	TipoDeAcuatico(String tipo){
		this.tipo = tipo;
	}
	public String getTipoDeAcuatico() {
		// TODO Auto-generated method stub
		return tipo;
	}
}

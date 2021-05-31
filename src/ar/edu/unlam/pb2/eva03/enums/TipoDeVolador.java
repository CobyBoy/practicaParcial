package ar.edu.unlam.pb2.eva03.enums;

public enum TipoDeVolador {
	AVION("Avion"),
	HIDROAVION("Hidroavion");
	
	private String tipo;
	TipoDeVolador(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipoDeVolador(){
		return tipo;
	}
}

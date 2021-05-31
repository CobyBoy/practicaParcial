package ar.edu.unlam.pb2.eva03.enums;

public enum TipoDeVehiculo {
	ACUATICO("NAVAL"),
	TERRESTRE("TERRESTRE"),
	VOLADOR("AEREA");
	
	private String tipo;
	
	TipoDeVehiculo(String tipo) {
		this.tipo = tipo;
	};
	
	
	public String getTipoDeVehiculo() {
		return tipo;
	}
}

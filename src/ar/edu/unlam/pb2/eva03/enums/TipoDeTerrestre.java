package ar.edu.unlam.pb2.eva03.enums;

public enum TipoDeTerrestre {
	TANQUE("Tanque"), CAMION("Camion");

	private String tipo;
	private TipoDeTerrestre(String tipo) {
		this.tipo = tipo;
	}
	public String getTipoDeTerrestre() {
		// TODO Auto-generated method stub
		return tipo;
	}

}

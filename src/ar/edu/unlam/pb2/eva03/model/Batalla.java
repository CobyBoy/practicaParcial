package ar.edu.unlam.pb2.eva03.model;

import java.util.*;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;

public class Batalla {
	private Double latitud;
	private Double longitud;
	private TipoDeBatalla tipo;
	private String nombre;
	private List<Vehiculo> vehiculosEnLaBatalla;
	
	public Batalla(String nombre, TipoDeBatalla tipo, Double latitud, Double longitud) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.latitud = latitud;
		this.longitud = longitud;
		this.vehiculosEnLaBatalla = new LinkedList<Vehiculo>();
	}

	@Override
	public String toString() {
		return "Batalla [tipo=" + tipo + ", nombre=" + nombre + ", vehiculosEnLaBatalla=" + vehiculosEnLaBatalla + "]";
	}

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	public TipoDeBatalla getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeBatalla tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Vehiculo> getVehiculosEnLaBatalla() {
		return vehiculosEnLaBatalla;
	}

	public void setVehiculosEnLaBatalla(List<Vehiculo> vehiculosEnLaBatalla) {
		this.vehiculosEnLaBatalla = vehiculosEnLaBatalla;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Batalla other = (Batalla) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	public void agregarVehiculoABatalla(Vehiculo vehiculoEnConvoy) {
		this.vehiculosEnLaBatalla.add(vehiculoEnConvoy);
	};
	
}

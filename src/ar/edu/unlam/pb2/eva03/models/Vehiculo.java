package ar.edu.unlam.pb2.eva03.models;

public abstract class Vehiculo implements Comparable<Vehiculo>{
	protected Integer id;
	protected String nombreDeModelo;
	
	public Vehiculo(Integer id, String nombreDeModelo) {
		this.id = id;
		this.nombreDeModelo =  nombreDeModelo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreDeModelo() {
		return nombreDeModelo;
	}

	public void setNombreDeModelo(String nombreDeModelo) {
		this.nombreDeModelo = nombreDeModelo;
	}
	
	public abstract String getTipoDeVehiculo();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Vehiculo other = (Vehiculo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vehiculo [id=" + id + ", nombreDeModelo=" + nombreDeModelo + "]";
	}
}

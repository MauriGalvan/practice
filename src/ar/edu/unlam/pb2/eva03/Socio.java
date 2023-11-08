package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;

public abstract class Socio {

	Integer nroSocio;
	String nombre;
	
	public Socio(Integer nroSocio, String nombre) {
	this.nroSocio = nroSocio;
	this.nombre = nombre;
	}
	public Socio() {
		
	}
	public abstract Integer getDistanciaPreferida();
	public abstract TipoDeBicicleta getTipoDeBicicleta();
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getNroSocio() {
		return nroSocio;
	}

	public void setNroSocio(Integer nroSocio) {
		this.nroSocio = nroSocio;
	}

	

}

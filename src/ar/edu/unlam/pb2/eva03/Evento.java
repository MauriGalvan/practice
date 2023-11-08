package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Evento {

	private TipoDeEvento tipo;
	private Integer numeroDeInscripcion;
	private Map<Integer, Socio> participantes;
	public Evento(TipoDeEvento tipo, Integer numeroDeInscripcion, Map<Integer, Socio> participantes) {
		super();
		this.tipo = tipo;
		this.numeroDeInscripcion = numeroDeInscripcion;
		this.participantes = new HashMap<>();
	}
	public Evento(TipoDeEvento tipo) {
		this.tipo = tipo;
	}
	public TipoDeEvento getTipo() {
		return tipo;
	}
	public void setTipo(TipoDeEvento tipo) {
		this.tipo = tipo;
	}
	public Integer getNumeroDeInscripcion() {
		return numeroDeInscripcion;
	}
	public void setNumeroDeInscripcion(Integer numeroDeInscripcion) {
		this.numeroDeInscripcion = numeroDeInscripcion;
	}
	public Map<Integer, Socio> getParticipantes() {
		return participantes;
	}
	public void setParticipantes(Map<Integer, Socio> participantes) {
		this.participantes = participantes;
	}
	
}

package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Club {

	private String nombre;
	private Set<Socio> socios;
	private Map<String, Evento> competencias;
	private Map<String , Socio>	inscripcion;
	private TipoDeEvento tipo;
	private Set<Evento> eventos;

	public Club(String nombre) {
		this.nombre = nombre;
		this.socios = new HashSet<>();
		this.competencias = new HashMap<>();
		this.inscripcion = new HashMap<>();
		this.eventos = new HashSet<>();
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Set<Socio> getSocios() {
		return socios;
	}


	public void setSocios(Set<Socio> socios) {
		this.socios = socios;
	}


	public Map<String, Evento> getCompetencias() {
		return competencias;
	}


	public void setCompetencias(Map<String, Evento> competencias) {
		this.competencias = competencias;
	}


	public void agregarDeportista(Socio deportista) {
		socios.add(deportista);
		
	}


	public Integer getCantidadSocios() {
		// TODO Auto-generated method stub
		return socios.size();
	}


	public void crearEvento(TipoDeEvento tipoEvento, String nombreEvento) {
		this.competencias.put(nombreEvento, new Evento( tipoEvento));
		
	}


	public void inscribirEnEvento(String nombreEvento, Socio socio) throws NoEstaPreparado {
		validarInscripcion(socio);
		inscripcion.put(nombreEvento, socio);
	}


	private boolean validarInscripcion(Socio socio) throws NoEstaPreparado {
		
		switch(this.tipo) {
		case CARRERA_NATACION_EN_AGUAS_ABIERTAS: {
			if(socio instanceof INadador) 
				return true;
		}
		case CARRERA_5K: {
			if(socio instanceof ICorredor) 
				return true;
		}
		case DUATLON: {
			if(socio instanceof ICiclista) 
				return true;
			
		}
		}
		
			throw new NoEstaPreparado();
	
		
	}
	
}

package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Triatleta extends Socio implements ICiclista, ICorredor, INadador {
		
	public String nombreCarrera;
		public TipoDeBicicleta tipo;
	public Triatleta(Integer nroSocio, String nombre, String nombreCarrera, TipoDeBicicleta tipoBicicleta) {
		super(nroSocio,nombre);
		this.nombreCarrera = nombreCarrera;
		this.tipo = tipoBicicleta; 
	}

	@Override
	public void nadar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getDistanciaPreferida() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getNombreCarrera() {
		return nombreCarrera;
	}

	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}

	public TipoDeBicicleta getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeBicicleta tipo) {
		this.tipo = tipo;
	}

	@Override
	public TipoDeBicicleta getTipoDeBicicleta() {
		return tipo;
		// TODO Auto-generated method stub
		
	}

}

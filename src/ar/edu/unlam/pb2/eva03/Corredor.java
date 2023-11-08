package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;

public class Corredor extends Socio implements ICorredor{

	
	Integer distanciaPreferida;
	Integer CantKilometrosEntrenados;
	
	public Corredor(Integer nroSocio, String nombre,Integer distanciaPreferida) {
		super(nroSocio, nombre);
		this.distanciaPreferida = distanciaPreferida;
		this.setCantidadDeKilometrosEntrenados(CantKilometrosEntrenados);
	}

	public Integer getDistanciaPreferida() {
		return distanciaPreferida;
	}

	public void setDistanciaPreferida(int distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		
		this.CantKilometrosEntrenados = km;
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		
		return CantKilometrosEntrenados ;
	}

	@Override
	public TipoDeBicicleta getTipoDeBicicleta() {
		return null;
		// TODO Auto-generated method stub
		
	}
	

}

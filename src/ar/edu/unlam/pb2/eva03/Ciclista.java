package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;

public class Ciclista extends Socio implements ICiclista {
	TipoDeBicicleta TipoDeBicicleta;

	public Ciclista(Integer nroSocio, String nombre) {
		super(nroSocio, nombre);
		// TODO Auto-generated constructor stub
	}

	public Ciclista(Integer nroSocio, String nombre,TipoDeBicicleta Tipo) {
		super(nroSocio, nombre);
		TipoDeBicicleta = Tipo;
	}

	

	public TipoDeBicicleta getTipoDeBicicleta() {
		return TipoDeBicicleta;
	}

	public void setTipoDeBicicleta(TipoDeBicicleta tipoDeBicicleta) {
		TipoDeBicicleta = tipoDeBicicleta;
	}

	@Override
	public Integer getDistanciaPreferida() {
		// TODO Auto-generated method stub
		return null;
	}



}

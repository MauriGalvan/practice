package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.EstiloNatacion;
import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;

public class Nadador extends Socio{
	
EstiloNatacion estiloPreferido;
 

	public Nadador(Integer nroSocio,String nombre ,EstiloNatacion estiloPreferido) {
	super(nroSocio,nombre);
	this.estiloPreferido = estiloPreferido;
}


	public EstiloNatacion getEstiloPreferido() {
		return estiloPreferido;
	}


	public void setEstiloPreferido(EstiloNatacion estiloPreferido) {
		this.estiloPreferido = estiloPreferido;
	}


	@Override
	public Integer getDistanciaPreferida() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public TipoDeBicicleta getTipoDeBicicleta() {
		// TODO Auto-generated method stub
		return null;
	}






	
	
	
}

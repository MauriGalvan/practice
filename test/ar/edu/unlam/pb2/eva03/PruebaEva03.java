package ar.edu.unlam.pb2.eva03;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.eva03.enumeradores.EstiloNatacion;
import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class PruebaEva03 {
	
	@Test
	public void queSePuedaCrearUnNadador() {
		Nadador nuevo = new Nadador(1, "Camila", EstiloNatacion.Espalda);
		EstiloNatacion espalda = EstiloNatacion.Espalda;

		assertEquals(espalda, nuevo.getEstiloPreferido());
		assertEquals((Integer)1, nuevo.getNroSocio());
	}
	
	@Test
	public void queSePuedaCrearUnCorredor() {
		Corredor nuevo = new Corredor(2, "Carolina", 10000);
		nuevo.setCantidadDeKilometrosEntrenados(50000);
		
		assertEquals((Integer)10000, nuevo.getDistanciaPreferida());
		assertEquals((Integer)50000, nuevo.getCantidadDeKilometrosEntrenados());
		assertEquals((Integer)2, nuevo.getNroSocio());
	}
	
	@Test
	public void  queSePuedaCrearUnCiclista() {
		Ciclista nuevo = new Ciclista(3, "Enzo", TipoDeBicicleta.RUTA);
		TipoDeBicicleta Tipo = TipoDeBicicleta.RUTA;
		assertEquals(Tipo, nuevo.getTipoDeBicicleta());
		assertEquals((Integer) 3, nuevo.getNroSocio());
	}

	@Test
	public void  queSePuedaCrearUnTriatleta() {
		Triatleta nuevo = new Triatleta(4, "Luna", "Olimpico", TipoDeBicicleta.TRIA);
		
		assertEquals("Olimpico", nuevo.getNombreCarrera());
		assertEquals(TipoDeBicicleta.TRIA, nuevo.getTipoDeBicicleta());
		assertEquals((Integer)4, nuevo.getNroSocio());
	}
	
	@Test
	public void  queSePuedanIncorporarDistintosDeportistas() {
		// El n�mero de socio no se puede repetir
		Club actual = new Club("CARP");
		
		actual.agregarDeportista(new Corredor(1000, "Camila", 42000));
		actual.agregarDeportista(new Corredor(1001, "Natalia", 5000));
		actual.agregarDeportista(new Corredor(1002, "Jorge", 21000));
		actual.agregarDeportista(new Nadador(1003, "Lucrecia", EstiloNatacion.Pecho));
		actual.agregarDeportista(new Triatleta(1004, "Tamara", "Olimpico", TipoDeBicicleta.RUTA));
		actual.agregarDeportista(new Ciclista(1005, "Alberto", TipoDeBicicleta.MOUNTAIN));
		actual.agregarDeportista(new Ciclista(1006, "Domingo", TipoDeBicicleta.BMX));
		actual.agregarDeportista(new Corredor(1007, "Luciana", 10000));
		actual.agregarDeportista(new Nadador(1008, "Luna", EstiloNatacion.Croll));
		actual.agregarDeportista(new Nadador(1009, "Victor", EstiloNatacion.Mariposa));
		actual.agregarDeportista(new Triatleta(1004, "Cecilia", "Ironman", TipoDeBicicleta.TRIA));
			Integer valorEsperado = 11;
		assertEquals(valorEsperado, actual.getCantidadSocios());		
	}
	
	@Test 
	public void  queUnCorredorPuedaInscribirEnUnaCarrera () throws NoEstaPreparado{	
		// En las carreras de nataci�n s�lo pueden inscribirse los que sean INadador
		Socio celeste = new Corredor(1000, "Celeste", 10000);
		Club actual = new Club("Sitas");
		actual.agregarDeportista(celeste);
		actual.crearEvento(TipoDeEvento.CARRERA_5K, "Maraton");
		actual.inscribirEnEvento("Maraton", celeste);
		
		
	}
	@Test (expected = NoEstaPreparado.class)
	public void  queUnCorredorNoSePuedaInscribirEnUnaCarreraDeNatacion () throws NoEstaPreparado{	
		// En las carreras de nataci�n s�lo pueden inscribirse los que sean INadador
		Socio celeste = new Corredor(1000, "Celeste", 10000);
		Club actual = new Club("Sitas");
		actual.agregarDeportista(celeste);
		actual.crearEvento(TipoDeEvento.CARRERA_NATACION_EN_AGUAS_ABIERTAS, "Maraton de aguas abiertas");
		
		assertEquals((Integer)1, actual.inscribirEnEvento("Maraton de aguas abiertas", celeste));
		assertNotNull(actual.inscribirEnEvento("Maraton de aguas abiertas", celeste));
	}
//	
//	@Test (expected = NoEstaPreparado.class)
//	public void  queUnCorredorNoSePuedaInscribirEnUnTriatlon () throws NoEstaPreparado{		
//		// En los triatlones s�lo pueden inscribirse los que sean INadador & ICiclista
//		Deportista celeste = new Corredor(1000, "Celeste", 10000);
//		Club actual = new Club("Sitas");
//		
//		actual.crearEvento(TipoDeEvento.TRIATLON_IRONMAN, "Triatlon Khona");
//		
//		assertNotEquals((Integer)1, actual.inscribirEnEvento("Triatlon Khona", celeste));		
//	}
//	
//	@Test
//	public void  queUnCorredorPuedaCorrerUnaMaraton() throws NoEstaPreparado{		
//		Deportista celeste = new Corredor(999, "Celeste", 42000);
//		Club actual = new Club("Moron");
//				
//		((Corredor)celeste).setCantidadDeKilometrosEntrenados(100000);
//		actual.crearEvento(TipoDeEvento.CARRERA_42K, "Maraton de New York");
//		
//		assertEquals((Integer)1, actual.inscribirEnEvento("Maraton de New York", celeste));			
//	}
	
}

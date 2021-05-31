package ar.edu.unlam.pb2.eva03;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.eva03.enums.TipoDeBatalla;
import ar.edu.unlam.pb2.eva03.factories.AcuaticoFactory;
import ar.edu.unlam.pb2.eva03.factories.TerrestreFactory;
import ar.edu.unlam.pb2.eva03.factories.VoladorFactory;
import ar.edu.unlam.pb2.eva03.models.Acuatico;
import ar.edu.unlam.pb2.eva03.models.Anfibio;
import ar.edu.unlam.pb2.eva03.models.Avion;
import ar.edu.unlam.pb2.eva03.models.Camion;
import ar.edu.unlam.pb2.eva03.models.Destructor;
import ar.edu.unlam.pb2.eva03.models.FuerzaArmada;
import ar.edu.unlam.pb2.eva03.models.HidroAvion;
import ar.edu.unlam.pb2.eva03.models.Portaviones;
import ar.edu.unlam.pb2.eva03.models.Submarino;
import ar.edu.unlam.pb2.eva03.models.Tanque;
import ar.edu.unlam.pb2.eva03.models.Terrestre;
import ar.edu.unlam.pb2.eva03.models.Volador;

public class Recuperatorio {

	@Test
	public void queSePuedaCrearUnObjetoVolador() {
		//VoladorFactory voladorFactory = new VoladorFactory();
		Volador avion = new Avion(1, "A-10");
		//Volador avion2 = voladorFactory.crearTipoDeVolador("Avion", 1, "A-10");
		assertEquals(0.0, avion.getAltura(), 0.01);
	}
	
	@Test
	public void queSePuedaCrearUnObjetoTerrestre() {
		Terrestre tanque = new Tanque(5, "Renault FT");
		//TerrestreFactory terrestreFactory = new TerrestreFactory();
		//Terrestre tanque2 = terrestreFactory.crearTipoDeTerrestre("Tanque", 5, "Renault FT");
		assertEquals(0.0, tanque.getVelocidad(), 0.1);
		}
	
	@Test
	public void queSePuedaCrearUnObjetoAcuatico() {
		//AcuaticoFactory acuaticoFactory = new AcuaticoFactory();
		Acuatico submarino = new Submarino(8, "ARA - San Juan");
		//Acuatico submarino2 = acuaticoFactory.crearTipoDeAcuatico("Submarino", 8, "ARA - San Juan");
	
		assertEquals(0.0, submarino.getProfundidad(), 0.01);
	}
	
	@Test
	public void queSePuedaCrearUnObjetoAnfibio() {
		Anfibio var = new Anfibio(12, "LARC-5");
		var.getVelocidad();
		assertEquals(0.0, var.getVelocidad(), 0.01);
		assertEquals(0.0, var.getProfundidad(), 0.01);
	}
	
	@Test
	public void queSePuedaCrearUnHidroavion() {
		HidroAvion ag600 = new HidroAvion(12, "AG600");
	
		assertEquals(0.0, ag600.getAltura(), 0.01);
		assertEquals(0.0, ag600.getProfundidad(), 0.01);
	}
	
	@Test
	public void queSePuedaArmarElConvoy() {
		FuerzaArmada argentina = new FuerzaArmada();
		//VoladorFactory voladorFactory = new VoladorFactory();
		//TerrestreFactory terrestreFactory = new TerrestreFactory();
		//AcuaticoFactory acuaticoFactory = new AcuaticoFactory();
	
		argentina.agregarVehiculo(new Avion(1, "A-10"));
		//argentina.agregarVehiculo(voladorFactory.crearTipoDeVolador("Avion",1, "A-10"));
		argentina.agregarVehiculo(new Avion(2, "A-10"));
		//argentina.agregarVehiculo(voladorFactory.crearTipoDeVolador("Avion",2, "A-10"));
		argentina.agregarVehiculo(new Avion(3, "F-102"));
		//argentina.agregarVehiculo(voladorFactory.crearTipoDeVolador("Avion",3, "F-102"));
		argentina.agregarVehiculo(new Avion(4, "F-15"));
		//argentina.agregarVehiculo(voladorFactory.crearTipoDeVolador("Avion",4, "F-15"));
		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		//argentina.agregarVehiculo(terrestreFactory.crearTipoDeTerrestre("tanque",5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		//argentina.agregarVehiculo(terrestreFactory.crearTipoDeTerrestre("Camion",6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));
		//argentina.agregarVehiculo(terrestreFactory.crearTipoDeTerrestre("Camion",7, "T-72"));
		argentina.agregarVehiculo(new Submarino(8, "ARA - San Juan"));
		//argentina.agregarVehiculo(acuaticoFactory.crearTipoDeAcuatico("Submarino",8, "ARA - San Juan"));
		argentina.agregarVehiculo(new Portaviones(9, "A-10"));
		//argentina.agregarVehiculo(acuaticoFactory.crearTipoDeAcuatico("Portaviones",9, "A-10"));
		argentina.agregarVehiculo(new Destructor(10, "A-10"));
		//argentina.agregarVehiculo(acuaticoFactory.crearTipoDeAcuatico("Destructor",10, "A-10"));
		argentina.agregarVehiculo(new Destructor(11, "A-10"));
		//argentina.agregarVehiculo(acuaticoFactory.crearTipoDeAcuatico("Destructor",11, "A-10"));
		argentina.agregarVehiculo(new HidroAvion(12, "Mitsubishi F1M"));
		//argentina.agregarVehiculo(acuaticoFactory.crearTipoDeAcuatico("HidroAvion",12, "Mitsubishi F1M"));
		argentina.agregarVehiculo(new Anfibio(12, "LARC-5"));
		//argentina.agregarVehiculo(acuaticoFactory.crearTipoDeAcuatico("Anfibio",12, "LARC-5"));
		
		assertEquals((Integer)13, argentina.getCapacidadDeDefensa());
	}
	
	@Test
	public void queSePuedaCrearUnaBatalla() {
		FuerzaArmada argentina = new FuerzaArmada();
		
		argentina.crearBatalla("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3);
		
		assertEquals(100.5, argentina.getBatalla("San Lorenzo").getLatitud(),0.01);
		assertEquals(20.3, argentina.getBatalla("San Lorenzo").getLongitud(),0.01);
	}	
	
	@Test
	public void queSePuedaPresentarBatallaTerrestre() {
		FuerzaArmada argentina = new FuerzaArmada();
			
		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));
		System.out.println(argentina.getCapacidadDeDefensa());
		argentina.crearBatalla("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3);

		assertTrue(argentina.enviarALaBatalla("San Lorenzo", 5));
		assertTrue(argentina.enviarALaBatalla("San Lorenzo", 6));
		assertTrue(argentina.enviarALaBatalla("San Lorenzo", 7));		
	}

	@Test
	public void queSePuedaPresentarBatallaNaval() {
		FuerzaArmada argentina = new FuerzaArmada();
		//AcuaticoFactory acuaticoFactory = new AcuaticoFactory();
			
		argentina.agregarVehiculo(new Submarino(8, "A-10"));
		//argentina.agregarVehiculo(acuaticoFactory.crearTipoDeAcuatico("Submarino",8, "A-10"));
		argentina.agregarVehiculo(new Portaviones(9, "A-10"));
		//argentina.agregarVehiculo(acuaticoFactory.crearTipoDeAcuatico("Portaviones",9, "A-10"));
		argentina.agregarVehiculo(new Destructor(10, "A-10"));
		//argentina.agregarVehiculo(acuaticoFactory.crearTipoDeAcuatico("Destructor",10, "A-10"));
		argentina.agregarVehiculo(new Destructor(11, "A-10"));
		//argentina.agregarVehiculo(acuaticoFactory.crearTipoDeAcuatico("Destructor",11, "A-10"));
		argentina.agregarVehiculo(new HidroAvion(12, "A-10"));
		//argentina.agregarVehiculo(acuaticoFactory.crearTipoDeAcuatico("HidroAvion",12, "A-10"));
		argentina.agregarVehiculo(new Anfibio(13, "A-10"));
		//argentina.agregarVehiculo(acuaticoFactory.crearTipoDeAcuatico("Anfibio",13, "A-10"));
		argentina.crearBatalla("Pacifico", TipoDeBatalla.NAVAL, 200.5, 45.8);

		assertTrue(argentina.enviarALaBatalla("Pacifico", 8));
		assertTrue(argentina.enviarALaBatalla("Pacifico", 9));
		assertTrue(argentina.enviarALaBatalla("Pacifico", 10));
		assertTrue(argentina.enviarALaBatalla("Pacifico", 11));
		assertTrue(argentina.enviarALaBatalla("Pacifico", 12));
		assertTrue(argentina.enviarALaBatalla("Pacifico", 13));
	}

	@Test 
	public void queSeNoSePuedaEnviarAUnaBatallaEnTierraUnBarco(){
		FuerzaArmada argentina = new FuerzaArmada();
			
		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));
		argentina.agregarVehiculo(new Destructor(11, "A-10"));

		argentina.crearBatalla("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3);

		assertFalse(argentina.enviarALaBatalla("San Lorenzo", 11));

	}
	
	@Test
	public void queSeNoSePuedaEnviarAUnaBatallaUnVehiculoQueNoExista() {
		FuerzaArmada argentina = new FuerzaArmada();
			
		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));
		argentina.agregarVehiculo(new Destructor(11, "A-10"));

		argentina.crearBatalla("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3);

		assertFalse(argentina.enviarALaBatalla("San Lorenzo", 4));
	}
}

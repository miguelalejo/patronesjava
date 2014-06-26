package patron.disenio.implementacion;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import patron.disenio.entidad.electrodomestico.EquipoSonido;
import patron.disenio.entidad.electrodomestico.ReproductorDvd;
import patron.disenio.entidad.electrodomestico.Televisor;
import patron.disenio.enumeracion.TipoElectrodomestico;
import patron.disenio.interfaz.Electrodomestico;

@RunWith(MockitoJUnitRunner.class)
public class TestFabricaElectrodomestico {
	@InjectMocks
	private FabricaElectrodomestico fabricaElectrodomestico;
	private Electrodomestico televisor;
	private Electrodomestico reproductorDvd;
	private Electrodomestico equipoSonido;

	@Before
	public void inicializar() {
		crearElectrodomesticos();
	}

	private void crearElectrodomesticos() {
		televisor = fabricaElectrodomestico
				.crearElectrodomestico(TipoElectrodomestico.TELEVISOR);
		reproductorDvd = fabricaElectrodomestico
				.crearElectrodomestico(TipoElectrodomestico.REPRODUCTOR_DVD);
		equipoSonido = fabricaElectrodomestico
				.crearElectrodomestico(TipoElectrodomestico.EQUIPO_SONIDO);
	}

	@Test
	public void deberiaCrearUnTelevisor() {
		Electrodomestico electrodomestico = fabricaElectrodomestico
				.crearElectrodomestico(TipoElectrodomestico.TELEVISOR);
		boolean esInstanciaTelevisor = electrodomestico instanceof Televisor;
		Assert.assertTrue("Deberia ser insancia de televisor",
				esInstanciaTelevisor);
	}

	@Test
	public void deberiaCrearUnReproductorDeDvd() {
		Electrodomestico electrodomestico = fabricaElectrodomestico
				.crearElectrodomestico(TipoElectrodomestico.REPRODUCTOR_DVD);
		boolean esInstanciaReproductorDvd = electrodomestico instanceof ReproductorDvd;
		Assert.assertTrue("Deberia ser insancia de reproductor de dvd",
				esInstanciaReproductorDvd);
	}

	@Test
	public void deberiaCrearUnEquipoDeSonido() {
		Electrodomestico electrodomestico = fabricaElectrodomestico
				.crearElectrodomestico(TipoElectrodomestico.EQUIPO_SONIDO);
		boolean esInstanciaEquipoDeSonido = electrodomestico instanceof EquipoSonido;
		Assert.assertTrue("Deberia ser insancia de equipo de sonido",
				esInstanciaEquipoDeSonido);
	}

	@Test
	public void deberiaEncenderDiferentesElectrodomesticos() {
		televisor.encender();
		reproductorDvd.encender();
		equipoSonido.encender();
	}

	@Test
	public void deberiaApagarDiferentesElectrodomesticos() {
		televisor.apagar();
		reproductorDvd.apagar();
		equipoSonido.apagar();
	}
}

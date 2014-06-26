package patron.disenio.creacional.implementacion;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import patron.disenio.entidad.color.Azul;
import patron.disenio.entidad.electrodomestico.Televisor;
import patron.disenio.enumeracion.TipoColor;
import patron.disenio.enumeracion.TipoElectrodomestico;
import patron.disenio.enumeracion.TipoFabrica;
import patron.disenio.interfaz.Color;
import patron.disenio.interfaz.Electrodomestico;

@RunWith(MockitoJUnitRunner.class)
public class TestProductorFabricaAbstracta {
	@InjectMocks
	ProductorFabricaAbstracta productorFabricaElectrodomesticoColor;

	@Test
	public void deberiaCrearUnTelevisor() {
		FabricaAbstracta fabricaAbstracta = productorFabricaElectrodomesticoColor
				.crearFabrica(TipoFabrica.ELECTRODOMESTICO);
		Electrodomestico electrodomestico = fabricaAbstracta
				.crearElectrodomestico(TipoElectrodomestico.TELEVISOR);
		boolean esInstanciaTelevisor = electrodomestico instanceof Televisor;
		Assert.assertTrue("Deberia ser insancia de televisor",
				esInstanciaTelevisor);
	}

	@Test
	public void deberiaCrearUnColorAzul() {
		FabricaAbstracta fabricaAbstracta = productorFabricaElectrodomesticoColor
				.crearFabrica(TipoFabrica.COLOR);
		Color color = fabricaAbstracta.crearColor(TipoColor.AZUL);
		boolean esInstanciaAzul = color instanceof Azul;
		Assert.assertTrue("Deberia ser insancia de color azul", esInstanciaAzul);
	}

}

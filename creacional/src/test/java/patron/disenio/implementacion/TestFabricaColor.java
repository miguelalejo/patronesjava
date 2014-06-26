package patron.disenio.implementacion;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import patron.disenio.entidad.color.Azul;
import patron.disenio.entidad.color.Rojo;
import patron.disenio.enumeracion.TipoColor;
import patron.disenio.interfaz.Color;

@RunWith(MockitoJUnitRunner.class)
public class TestFabricaColor {
	@InjectMocks
	private FabricaColor fabricaColor;
	private Color rojo;
	private Color azul;

	@Before
	public void inicializar() {
		crearColors();
	}

	private void crearColors() {
		rojo = fabricaColor.crearColor(TipoColor.ROJO);
		azul = fabricaColor.crearColor(TipoColor.AZUL);

	}

	@Test
	public void deberiaCrearUnColorRojo() {
		Color color = fabricaColor.crearColor(TipoColor.ROJO);
		boolean esInstanciaRojo = color instanceof Rojo;
		Assert.assertTrue("Deberia ser insancia de color Rojo", esInstanciaRojo);
	}

	@Test
	public void deberiaCrearUnColorAzul() {
		Color azul = fabricaColor.crearColor(TipoColor.AZUL);
		boolean esInstanciaAzul = azul instanceof Azul;
		Assert.assertTrue("Deberia ser insancia de color azul", esInstanciaAzul);
	}

	@Test
	public void deberiaPintarDiferentesColores() {
		rojo.pintar();
		azul.pintar();
	}

}

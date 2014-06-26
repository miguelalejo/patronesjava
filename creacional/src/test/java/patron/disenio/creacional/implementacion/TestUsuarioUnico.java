package patron.disenio.creacional.implementacion;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestUsuarioUnico {

	@Test
	public void deberiaObtenerUnaInstanciaUnica() {
		UsuarioUnico usuarioUnicoActual = UsuarioUnico.obtenerInstancia();
		usuarioUnicoActual.setActivo(true);
		UsuarioUnico usuarioUnicoActualSinAsignarEstado = UsuarioUnico
				.obtenerInstancia();
		Assert.assertNotNull(usuarioUnicoActual);
		Assert.assertTrue(usuarioUnicoActual.esActivo());
		Assert.assertNotNull(usuarioUnicoActualSinAsignarEstado);
		Assert.assertTrue(usuarioUnicoActualSinAsignarEstado.esActivo());
		Assert.assertEquals(usuarioUnicoActual,
				usuarioUnicoActualSinAsignarEstado);
	}

}

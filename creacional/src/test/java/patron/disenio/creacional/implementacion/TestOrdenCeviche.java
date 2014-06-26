package patron.disenio.creacional.implementacion;

import java.util.ArrayList;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import patron.disenio.entidad.bebida.CocaCola;
import patron.disenio.entidad.platofuerte.CevicheCamaron;
import patron.disenio.interfaz.Orden;

@RunWith(MockitoJUnitRunner.class)
public class TestOrdenCeviche {
	@InjectMocks
	private OrdenCeviche ordenCeviche;

	@Test
	public void deberiaCalcularELTotalDeLaOrden() {
		CevicheCamaron cevicheCamaron = new CevicheCamaron();
		CocaCola cocaCola = new CocaCola();
		ordenCeviche.agregarOrden(cevicheCamaron);
		ordenCeviche.agregarOrden(cocaCola);
		Double totalEsperado = cevicheCamaron.obtenerPrecio()
				+ cocaCola.obtenerPrecio();
		Double totalOrden = ordenCeviche.caluclarTotal();
		Assert.assertEquals(
				"Deberian se iguales los totales al sumar cada orden",
				totalEsperado, totalOrden);
	}

	@Test
	public void deberiaAgregaItems() {
		ordenCeviche.setListaOrdenes(new ArrayList<Orden>());
		ordenCeviche.agregarOrden(Mockito.mock(Orden.class));
		ordenCeviche.agregarOrden(Mockito.mock(Orden.class));
		ordenCeviche.agregarOrden(Mockito.mock(Orden.class));
		Assert.assertEquals("Deberian ser igual el tamaño de la lista", 3,
				ordenCeviche.getListaOrdenes().size());
	}
}

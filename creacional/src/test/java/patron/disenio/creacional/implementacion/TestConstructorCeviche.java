package patron.disenio.creacional.implementacion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestConstructorCeviche {

	@InjectMocks
	private ConstructorCeviche constructorCeviche;

	@Test
	public void deberiaConstrirUnaOrdenDeEmpanadaCamaronCevicheConchaAguaVivant() {
		OrdenCeviche ordenCeviche = constructorCeviche
				.preparaEmpanadaCamaronCevicheConchaAguaVivant();
		ordenCeviche.imprimirOrden();
	}
	
	@Test
	public void deberiaConstrirUnaOrdenDeEmpanadaCamaronCevicheCamaronColaFanta() {
		OrdenCeviche ordenCeviche = constructorCeviche
				.preparaEmpanadaCamaronCevicheCamaronColaFanta();
		ordenCeviche.imprimirOrden();
	}

}

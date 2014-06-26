package patron.disenio.creacional.implementacion;

import patron.disenio.enumeracion.TipoColor;
import patron.disenio.enumeracion.TipoElectrodomestico;
import patron.disenio.interfaz.Color;
import patron.disenio.interfaz.Electrodomestico;

public abstract class FabricaAbstracta {
	abstract Electrodomestico crearElectrodomestico(
			TipoElectrodomestico tipoElectrodomestico);

	abstract Color crearColor(TipoColor tipoColor);

}

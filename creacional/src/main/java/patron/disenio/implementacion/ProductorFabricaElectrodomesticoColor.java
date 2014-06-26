package patron.disenio.implementacion;

import patron.disenio.enumeracion.TipoFabrica;

public class ProductorFabricaElectrodomesticoColor {

	public FabricaAbstracta crearFabrica(TipoFabrica tipoFabrica) {
		if (TipoFabrica.ELECTRODOMESTICO.equals(tipoFabrica)) {
			return new FabricaElectrodomestico();
		}
		if (TipoFabrica.COLOR.equals(tipoFabrica)) {
			return new FabricaColor();
		}
		return null;
	}

}

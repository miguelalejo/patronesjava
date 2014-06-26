/**
 * 
 */
package patron.disenio.creacional.implementacion;

import patron.disenio.entidad.color.Azul;
import patron.disenio.entidad.color.Rojo;
import patron.disenio.enumeracion.TipoColor;
import patron.disenio.enumeracion.TipoElectrodomestico;
import patron.disenio.interfaz.Color;
import patron.disenio.interfaz.Electrodomestico;

/**
 * @author mapp190413
 * 
 */
public class FabricaColor extends FabricaAbstracta {

	@Override
	Electrodomestico crearElectrodomestico(
			TipoElectrodomestico tipoElectrodomestico) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Color crearColor(TipoColor tipoColor) {
		if (TipoColor.AZUL.equals(tipoColor)) {
			return new Azul();
		}
		if (TipoColor.ROJO.equals(tipoColor)) {
			return new Rojo();
		}
		return null;
	}

}

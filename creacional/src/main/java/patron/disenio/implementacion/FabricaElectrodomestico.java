package patron.disenio.implementacion;

import patron.disenio.entidad.electrodomestico.EquipoSonido;
import patron.disenio.entidad.electrodomestico.ReproductorDvd;
import patron.disenio.entidad.electrodomestico.Televisor;
import patron.disenio.enumeracion.TipoColor;
import patron.disenio.enumeracion.TipoElectrodomestico;
import patron.disenio.interfaz.Color;
import patron.disenio.interfaz.Electrodomestico;

public class FabricaElectrodomestico extends FabricaAbstracta {

	@Override
	Electrodomestico crearElectrodomestico(
			TipoElectrodomestico tipoElectrodomestico) {
		if (TipoElectrodomestico.TELEVISOR.equals(tipoElectrodomestico)) {
			return new Televisor();
		}
		if (TipoElectrodomestico.REPRODUCTOR_DVD.equals(tipoElectrodomestico)) {
			return new ReproductorDvd();
		}
		if (TipoElectrodomestico.EQUIPO_SONIDO.equals(tipoElectrodomestico)) {
			return new EquipoSonido();
		}
		return null;
	}

	@Override
	Color crearColor(TipoColor tipoColor) {
		// TODO Auto-generated method stub
		return null;
	}

}

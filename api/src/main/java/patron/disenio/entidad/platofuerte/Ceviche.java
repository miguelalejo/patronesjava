package patron.disenio.entidad.platofuerte;

import patron.disenio.entidad.producto.PlatoFuerte;
import patron.disenio.interfaz.Orden;
import patron.disenio.interfaz.Producto;

public abstract class Ceviche implements Orden {

	public Producto obtenerProducto() {
		return new PlatoFuerte();
	}

}

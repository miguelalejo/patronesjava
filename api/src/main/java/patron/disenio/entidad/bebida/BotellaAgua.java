package patron.disenio.entidad.bebida;

import patron.disenio.entidad.producto.Bebida;
import patron.disenio.interfaz.Orden;
import patron.disenio.interfaz.Producto;

public abstract class BotellaAgua implements Orden {

	public Producto obtenerProducto() {
		return new Bebida();
	}

}

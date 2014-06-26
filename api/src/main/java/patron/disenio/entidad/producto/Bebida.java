package patron.disenio.entidad.producto;

import patron.disenio.enumeracion.TipoProducto;
import patron.disenio.interfaz.Producto;

public class Bebida implements Producto {

	public TipoProducto obtenerTipoProducto() {
		return TipoProducto.BEBIDA;
	}

}

package patron.disenio.entidad.entrada;

import patron.disenio.entidad.producto.Entrada;
import patron.disenio.interfaz.Orden;
import patron.disenio.interfaz.Producto;

public abstract class Empanada implements Orden {

	public Producto obtenerProducto() {
		return new Entrada();
	}

}

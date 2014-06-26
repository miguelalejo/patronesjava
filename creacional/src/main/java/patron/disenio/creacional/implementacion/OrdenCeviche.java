package patron.disenio.creacional.implementacion;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import patron.disenio.interfaz.Orden;

public class OrdenCeviche {
	private static final Logger LOG = Logger.getLogger(OrdenCeviche.class);
	private List<Orden> listaOrdenes;

	public OrdenCeviche() {
		listaOrdenes = new ArrayList<Orden>();
	}

	public List<Orden> getListaOrdenes() {
		return listaOrdenes;
	}

	public void setListaOrdenes(List<Orden> listaOrdenes) {
		this.listaOrdenes = listaOrdenes;
	}

	public Double caluclarTotal() {
		Double totalOrden = 0.0;
		for (Orden orden : listaOrdenes) {
			totalOrden += orden.obtenerPrecio();
		}
		return totalOrden;
	}

	public void agregarOrden(Orden orden) {
		listaOrdenes.add(orden);
	}

	public void imprimirOrden() {
		for (Orden orden : listaOrdenes) {
			LOG.info("PRODUCTO:"
					+ orden.obtenerProducto().obtenerTipoProducto());
			LOG.info("PRECIO:" + orden.obtenerPrecio());
			LOG.info("NOMBRE:" + orden.obtenerNombre());
		}
	}
}

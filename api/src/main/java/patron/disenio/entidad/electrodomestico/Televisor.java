package patron.disenio.entidad.electrodomestico;

import org.apache.log4j.Logger;

import patron.disenio.interfaz.Electrodomestico;

public class Televisor implements Electrodomestico {
	private static final Logger LOG = Logger.getLogger(Televisor.class);

	public void encender() {
		LOG.info("ENCENDIDO");
	}

	public void apagar() {
		LOG.info("APAGADO");
	}

}

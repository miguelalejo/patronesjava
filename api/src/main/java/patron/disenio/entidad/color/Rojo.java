package patron.disenio.entidad.color;

import org.apache.log4j.Logger;

import patron.disenio.interfaz.Color;

public class Rojo implements Color {
	private static final Logger LOG = Logger.getLogger(Rojo.class);

	public void pintar() {
		LOG.info("ROJO");
	}
}

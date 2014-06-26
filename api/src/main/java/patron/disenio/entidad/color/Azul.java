package patron.disenio.entidad.color;

import org.apache.log4j.Logger;

import patron.disenio.interfaz.Color;

public class Azul implements Color {
	private static final Logger LOG = Logger.getLogger(Azul.class);

	public void pintar() {
		LOG.info("AZUL");
	}

}

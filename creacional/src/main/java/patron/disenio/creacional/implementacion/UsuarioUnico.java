package patron.disenio.creacional.implementacion;

public class UsuarioUnico {
	private static UsuarioUnico instancia = new UsuarioUnico();
	private boolean activo;

	public UsuarioUnico() {

	}

	public static UsuarioUnico obtenerInstancia() {
		return instancia;
	}

	public boolean esActivo() {
		return activo;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

}

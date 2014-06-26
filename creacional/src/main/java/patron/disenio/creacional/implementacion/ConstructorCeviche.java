package patron.disenio.creacional.implementacion;

import patron.disenio.entidad.bebida.Fanta;
import patron.disenio.entidad.bebida.Vivant;
import patron.disenio.entidad.entrada.EmpandaCamaron;
import patron.disenio.entidad.platofuerte.CevicheCamaron;
import patron.disenio.entidad.platofuerte.CevicheConcha;

public class ConstructorCeviche {

	public OrdenCeviche preparaEmpanadaCamaronCevicheConchaAguaVivant() {
		OrdenCeviche ordenCeviche = new OrdenCeviche();
		ordenCeviche.agregarOrden(new EmpandaCamaron());
		ordenCeviche.agregarOrden(new CevicheConcha());
		ordenCeviche.agregarOrden(new Vivant());
		return ordenCeviche;
	}

	public OrdenCeviche preparaEmpanadaCamaronCevicheCamaronColaFanta() {
		OrdenCeviche ordenCeviche = new OrdenCeviche();
		ordenCeviche.agregarOrden(new EmpandaCamaron());
		ordenCeviche.agregarOrden(new CevicheCamaron());
		ordenCeviche.agregarOrden(new Fanta());
		return ordenCeviche;
	}

}

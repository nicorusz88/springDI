package ar.com.springdi.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("estacionMetereologicaEste")
public class EstacionMetereologicaEste implements EstacionMetereologica {
	
	@Autowired
	@Qualifier("barometro")
	private Instrumento instrumento;

	public EstacionMetereologicaEste() {
		super();
	}

	public Instrumento getInstrumento() {
		return instrumento;
	}


	public void setInstrumento(Instrumento instrumento) {
		this.instrumento = instrumento;
	}

	public void tomarMedicion() {
		instrumento.medir();
	}
}

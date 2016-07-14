package ar.com.springdi.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("estacionMetereologicaSur")
public class EstacionMetereologicaSur implements EstacionMetereologica {

	private Instrumento instrumento;

	public EstacionMetereologicaSur() {
		super();
	}

	public Instrumento getInstrumento() {
		return instrumento;
	}

	@Autowired
	@Qualifier("termometro")
	public void setInstrumento(Instrumento instrumento) {
		this.instrumento = instrumento;
	}

	public void tomarMedicion() {
		instrumento.medir();
	}
}

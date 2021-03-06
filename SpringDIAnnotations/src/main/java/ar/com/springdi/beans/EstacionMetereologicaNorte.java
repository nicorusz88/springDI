package ar.com.springdi.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("estacionMetereologicaNorte")
public class EstacionMetereologicaNorte implements EstacionMetereologica {

	private Instrumento instrumento;

	@Autowired
	public EstacionMetereologicaNorte(@Qualifier("barometro") Instrumento instrumento) {
		super();
		this.instrumento = instrumento;
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

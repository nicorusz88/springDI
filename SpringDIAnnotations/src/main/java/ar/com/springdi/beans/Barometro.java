package ar.com.springdi.beans;

import org.springframework.stereotype.Component;

@Component("barometro")
public class Barometro implements Instrumento {

	public void medir() {
		System.out.println("Mide la presion atmosferica");
	}

}

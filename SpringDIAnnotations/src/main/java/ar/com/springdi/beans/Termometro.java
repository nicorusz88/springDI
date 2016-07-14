package ar.com.springdi.beans;

import org.springframework.stereotype.Component;

@Component("termometro")
public class Termometro implements Instrumento {

	public void medir() {
		System.out.println("Mide la temperatura");
	}

}

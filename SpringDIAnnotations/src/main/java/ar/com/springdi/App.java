package ar.com.springdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ar.com.springdi.beans.EstacionMetereologica;
import ar.com.springdi.configuration.SpringConfiguration;

public class App {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

		EstacionMetereologica norte = context.getBean("estacionMetereologicaNorte", EstacionMetereologica.class);
		norte.tomarMedicion();

		EstacionMetereologica sur = context.getBean("estacionMetereologicaSur", EstacionMetereologica.class);
		sur.tomarMedicion();

		EstacionMetereologica estacionNorteTermometro = context.getBean("norteTermometro", EstacionMetereologica.class);
		estacionNorteTermometro.tomarMedicion();

	}
}

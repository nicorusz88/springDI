package ar.com.springdi.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import ar.com.springdi.beans.EstacionMetereologica;
import ar.com.springdi.beans.EstacionMetereologicaNorte;
import ar.com.springdi.beans.Termometro;

@Configuration
@ComponentScan(basePackages = {"ar.com.springdi"})
public class SpringConfiguration {

    @Bean(name = "norteTermometro")
    public EstacionMetereologica getNorteTermometro(){
        EstacionMetereologica estacionMetereologica = new EstacionMetereologicaNorte(new Termometro());
        return estacionMetereologica;
    }
}

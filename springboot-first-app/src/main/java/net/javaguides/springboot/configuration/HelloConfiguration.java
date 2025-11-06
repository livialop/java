package net.javaguides.springboot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfiguration {
    // normalmente se define metodos public

    //@Bean // indica pro spring que deve gerenciar o retorno do metodo como bean
    //public MyService myService() {
    //    return new MyServiceImpl();
    //}
}

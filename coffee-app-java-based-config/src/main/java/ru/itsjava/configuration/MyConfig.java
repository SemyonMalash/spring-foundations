package ru.itsjava.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.itsjava.services.interfaces.CoffeeService;
import ru.itsjava.services.impl.CoffeeServiceImpl;
import ru.itsjava.services.interfaces.IOService;
import ru.itsjava.services.impl.IOServiceImpl;

import java.io.InputStream;

@Configuration
public class MyConfig {

    @Value("#{T(java.lang.System).in}")
    private InputStream inputStream;

    @Bean
    public IOService ioService(){
        return new IOServiceImpl(inputStream);
    }

    @Bean
    public CoffeeService coffeeService(IOServiceImpl ioService) {
        return new CoffeeServiceImpl(ioService);
    }
}

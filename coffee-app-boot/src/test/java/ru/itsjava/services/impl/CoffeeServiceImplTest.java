package ru.itsjava.services.impl;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.itsjava.services.CoffeeService;
import ru.itsjava.services.IOService;
import ru.itsjava.services.exceptions.IncorrectPriceException;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
@DisplayName("Класс CoffeeServiceImpl")
public class CoffeeServiceImplTest {

    @Configuration
    static class MyConfiguration {

        @Bean
        public IOService ioService() {
            IOService mockIOService = Mockito.mock(IOServiceImpl.class);

            when(mockIOService.input()).thenReturn("100");
            return mockIOService;
        }

        @Bean
        public CoffeeService coffeeService(IOService ioService) {
            return new CoffeeServiceImpl(ioService);
        }
    }

    @Autowired
    private CoffeeServiceImpl coffeeService;

    @Test
    @DisplayName("находит кофе")
    public void getCoffeeByPrice() throws IncorrectPriceException {
        coffeeService.getCoffeeByPrice();
    }

    @Test
    @DisplayName("здоровается, выдаёт кофе")
    public void coffeeHouse() throws IncorrectPriceException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        coffeeService.coffeeHouse();
        assertEquals("Добрый день, введите сумму для оплаты\r\nCoffee Cappuccino 100.0\r\n", out.toString());
    }
}

package ru.itsjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.itsjava.services.CoffeeService;
import ru.itsjava.services.exceptions.IncorrectPriceException;

@SpringBootApplication
public class CoffeeAppBootApplication {

	public static void main(String[] args) throws IncorrectPriceException {
		ConfigurableApplicationContext context = SpringApplication.run(CoffeeAppBootApplication.class, args);

		CoffeeService coffeeService = context.getBean("coffeeService", CoffeeService.class);
		coffeeService.coffeeHouse();
	}
}

package ru.itsjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import ru.itsjava.services.exceptions.IncorrectPriceException;
import ru.itsjava.services.CoffeeService;

@ComponentScan("ru.itsjava.configuration")
public class Application {

    public static void main(String[] args) throws IncorrectPriceException {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(Application.class);

        CoffeeService coffeeService = context.getBean("coffeeService", CoffeeService.class);
        coffeeService.coffeeHouse();
    }
}

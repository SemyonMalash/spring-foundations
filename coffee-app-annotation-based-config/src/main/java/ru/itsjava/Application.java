package ru.itsjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import ru.itsjava.services.CoffeeService;
import ru.itsjava.services.exceptions.IncorrectPriceException;

@ComponentScan("ru.itsjava.services")
public class Application {

    public static void main(String[] args) throws IncorrectPriceException {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(Application.class);

        CoffeeService coffeeService = context.getBean("coffeeService", CoffeeService.class);
        coffeeService.coffeeHouse();
    }
}

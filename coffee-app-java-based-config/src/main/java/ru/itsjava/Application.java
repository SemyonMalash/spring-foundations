package ru.itsjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Application {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(Application.class);

        CoffeeService coffeeService = context.getBean("coffeeService", CoffeeService.class);
        coffeeService.coffeeHouse();
    }
}

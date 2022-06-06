package ru.itsjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) throws IncorrectPriceException {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");

        CoffeeService coffeeService = context.getBean("coffeeService", CoffeeService.class);
        coffeeService.coffeeHouse();
    }
}

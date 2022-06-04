package ru.itsjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");

        CoffeeService coffeeService = context.getBean("coffeeService", CoffeeService.class);
        coffeeService.CoffeeHouse();
    }
}

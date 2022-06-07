package ru.itsjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Scope("prototype")
@Component
public class KindFarmer {
    @Autowired
    private Animal animal;

    public KindFarmer() {
        System.out.println("Constructor KF");
    }

    public void hiToAnimal() {
        System.out.println("Привет");
        animal.say();
    }

    @Autowired
    public void setAnimal(Animal animal) {
        System.out.println("Setter");
        this.animal = animal;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("PostConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("PreDestroy");
    }
}
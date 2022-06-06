package ru.itsjava;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class KindFarmer {

    private final Animal animal;

    public KindFarmer(@Qualifier("lamb") Animal animal) {
        this.animal = animal;
    }

    public void hiToAnimal() {
        System.out.println("Привет");
        animal.say();
    }
}
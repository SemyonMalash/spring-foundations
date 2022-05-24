package ru.itsjava;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class KindFarmer {
    private final Animal animal;

    public void hiToAnimal() {
        System.out.println("Привет");
        animal.say();
    }
}

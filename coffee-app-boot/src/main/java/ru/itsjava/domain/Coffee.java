package ru.itsjava.domain;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Coffee {
    private final String type;
    private final double price;

    public String toString() {
        return "Coffee " + type + " " + price;
    }
}

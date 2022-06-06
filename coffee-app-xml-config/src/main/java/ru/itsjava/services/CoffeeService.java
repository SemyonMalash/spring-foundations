package ru.itsjava.services;

import ru.itsjava.IncorrectPriceException;
import ru.itsjava.domain.Coffee;

public interface CoffeeService {
    Coffee getCoffeeByPrice() throws IncorrectPriceException;

    void coffeeHouse() throws IncorrectPriceException;
}

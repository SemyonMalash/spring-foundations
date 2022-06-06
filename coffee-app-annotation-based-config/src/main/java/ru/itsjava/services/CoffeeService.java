package ru.itsjava.services;

import ru.itsjava.domain.Coffee;
import ru.itsjava.services.exceptions.IncorrectPriceException;

public interface CoffeeService {
    Coffee getCoffeeByPrice() throws IncorrectPriceException;

    void coffeeHouse() throws IncorrectPriceException;
}

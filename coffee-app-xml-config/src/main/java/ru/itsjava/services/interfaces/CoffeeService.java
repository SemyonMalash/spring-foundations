package ru.itsjava.services.interfaces;

import ru.itsjava.services.exceptions.IncorrectPriceException;
import ru.itsjava.domain.Coffee;

public interface CoffeeService {
    Coffee getCoffeeByPrice() throws IncorrectPriceException;

    void coffeeHouse() throws IncorrectPriceException;
}

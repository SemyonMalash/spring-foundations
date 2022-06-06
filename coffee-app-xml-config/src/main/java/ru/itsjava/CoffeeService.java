package ru.itsjava;

import ru.itsjava.domain.Coffee;

public interface CoffeeService {
    Coffee getCoffeeByPrice() throws IncorrectPriceException;

    void coffeeHouse() throws IncorrectPriceException;
}

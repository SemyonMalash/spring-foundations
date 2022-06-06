package ru.itsjava;

import lombok.RequiredArgsConstructor;
import ru.itsjava.domain.Coffee;
import ru.itsjava.services.CoffeeService;

@RequiredArgsConstructor
public class CoffeeServiceImpl implements CoffeeService {
    private final IOServiceImpl ioService;

    @Override
    public Coffee getCoffeeByPrice() throws IncorrectPriceException {
        String inputString = ioService.input();
        if (inputString.equals("100")) {
            return new Coffee("Cappuccino", 100);
        } else if (inputString.equals("130")) {
            return new Coffee("Latte", 130);
        }
        throw new IncorrectPriceException();
    }

    @Override
    public void coffeeHouse() throws IncorrectPriceException {
        System.out.println("Добрый день, введите сумму для оплаты");
        System.out.println(getCoffeeByPrice());
    }
}

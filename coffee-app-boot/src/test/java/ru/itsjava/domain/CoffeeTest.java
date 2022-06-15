package ru.itsjava.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Класс Coffee")
public class CoffeeTest {
    private Coffee coffee;

    @Test
    @DisplayName("выводит название и цену")
    public void toStringTest() {
        coffee = new Coffee("Капучино", 100);
        assertEquals("Coffee Капучино 100.0", coffee.toString());
    }
}

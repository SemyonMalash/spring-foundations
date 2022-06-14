package ru.itsjava.services;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootTest
@DisplayName("Класс NotebookServiceImpl")
public class NotebookServiceImplTest {

    @Configuration
    static class MyConfiguration {

        @Bean
        public NotebookService notebookService() {
            return new NotebookServiceImpl("apple", "air", 2022);
        }
    }

    @Autowired
    private NotebookServiceImpl notebookService;

    @Test
    @DisplayName("выдаёт ноутбук")
    public void getNotebook() {
        notebookService.getNotebook();
    }
}

package ru.itsjava.services;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.itsjava.domain.Notebook;

import static org.mockito.Mockito.when;

@SpringBootTest
@DisplayName("Класс ProgrammerServiceImpl")
public class ProgrammerServiceImplTest {

    @Configuration
    static class MyConfiguration {

        @Bean
        public IOService ioService() {
            IOService mockIOService = Mockito.mock(IOServiceImpl.class);

            when(mockIOService.input()).thenReturn("123");
            return mockIOService;
        }

        @Bean
        public NotebookService notebookService() {
            NotebookService mockNotebookService = Mockito.mock(NotebookServiceImpl.class);

            when(mockNotebookService.getNotebook()).thenReturn(new Notebook("ASUS", "322", 2022));
            return mockNotebookService;
        }

        @Bean
        public ProgrammerService programmerService(NotebookService notebookService, IOService ioService) {
            return new ProgrammerServiceImpl(notebookService, ioService);
        }
    }

    @Autowired
    private ProgrammerService programmerService;

    @Test
    @DisplayName("здоровается с пользователем")
    public void hiToNewProgrammer() {
        programmerService.hiToNewProgrammer();
    }
}

package ru.itsjava.services.impl;

import ru.itsjava.domain.Film;
import org.springframework.stereotype.Service;
import ru.itsjava.services.FilmService;

@Service
public class FilmServiceImpl implements FilmService {

    public FilmServiceImpl() {
        System.out.println("Constructor FilmServiceImpl");
    }

    @Override
    public Film getFilm() {
        System.out.println("invoke getFilm()");
        return new Film("Back to the future");
    }
}

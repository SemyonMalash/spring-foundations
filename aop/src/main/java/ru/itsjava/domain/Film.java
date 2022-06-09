package ru.itsjava.domain;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Film {
    private final String title;

    @Override
    public String toString() {
        return title;
    }
}

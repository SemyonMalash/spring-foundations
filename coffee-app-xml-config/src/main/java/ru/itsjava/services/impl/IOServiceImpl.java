package ru.itsjava.services.impl;

import lombok.SneakyThrows;
import ru.itsjava.services.IOService;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IOServiceImpl implements IOService {
    private final BufferedReader reader;

    public IOServiceImpl() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    @SneakyThrows
    @Override
    public String input() {
        return reader.readLine();
    }
}


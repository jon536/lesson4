package ru.ifmo.md.lesson4;

public class CalculationException extends Exception {
    public CalculationException() {
        super();
    }

    CalculationException(String msg) {
        super(msg);
    }

}

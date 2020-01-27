package com.kodilla.rps;

public class Moves{
    enum Move{
        PAPIER(0),
        KAMIEN(1),
        NOZYCZKI(2);

        private final int value;

        Move(final int newValue) {
            value = ordinal();
        }
    }
}

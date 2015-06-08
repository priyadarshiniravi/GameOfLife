package com.GameOfLife;

public class Cell {
    boolean state;

    Cell(boolean state) {
        this.state = state;
    }

    public char isAlive() {
        if (state)
            return 'a';
        else
            return 'd';

    }
}

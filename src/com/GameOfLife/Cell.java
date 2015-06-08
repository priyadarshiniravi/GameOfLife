package com.GameOfLife;

public class Cell {
    boolean state;

    Cell(boolean state) {
        this.state=state;
    }

    public boolean isAlive() {
        return true;
    }
}

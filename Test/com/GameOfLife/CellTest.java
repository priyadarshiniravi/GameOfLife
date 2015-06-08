package com.GameOfLife;

import org.junit.Assert;
import org.junit.Test;

public class CellTest {
    @Test
    public void ShouldBeAliveStateOfTheCell() {
        Cell cell = new Cell(true);

        boolean State = cell.isAlive();

        Assert.assertTrue(State);

    }
}

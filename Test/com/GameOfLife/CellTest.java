package com.GameOfLife;

import org.junit.Assert;
import org.junit.Test;

public class CellTest {
    @Test
    public void ShouldBeAliveStateOfTheCell() {
        Cell cell = new Cell(true);

        char State = cell.isAlive();

        Assert.assertEquals('a',State);

    }
}

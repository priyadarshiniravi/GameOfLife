package com.GameOfLife;

import org.junit.Assert;
import org.junit.Test;

public class CellTest {
    @Test
    public void ShouldBeAliveStateOfTheCell() {
        Cell cell = new Cell(true);

        char actualStatectualState = cell.isAlive();

        Assert.assertEquals('a', actualState);

    }

    public void ShouldBeDeadStateOfTheCell() {
        Cell cell = new Cell(false);

        char actualState = cell.isAlive();

        Assert.assertEquals('d', actualState);

    }
}

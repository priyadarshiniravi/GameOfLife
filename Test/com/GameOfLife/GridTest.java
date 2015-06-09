package com.GameOfLife;

import junit.framework.Assert;
import org.junit.Test;

public class GridTest {
    @Test
    public void ShouldReturnZeroAliveNeighboursForABlock(){
        Grid grid=new Grid();
        Cell cell=mock(Cell.class);
        when(cell.)

        int actualNeighboursNumber=grid.AliveNeighboursCount(cell);

        Assert.assertEquals(0,actualNeighboursNumber);

    }
}

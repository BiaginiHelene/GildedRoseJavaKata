package com.pbz4esilv.gildedrose;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * Created by Sabrina on 09/10/2015.
 */
public class DegradedItemTest {

    @Test // He increases in Quality the older it gets
    public void testDegradedQuality() throws Exception {
        DegradedItem var = new DegradedItem("tititi", 20, 15);
        var.degradedQuality(var);
        Assert.assertEquals(14, var.getQuality());
        System.out.println("The new Quality value is " + var.getQuality());
    }

    @Test // Positivity Quality test
    public void Negative() throws Exception{
        DegradedItem var = new DegradedItem("Tototo", 2, 0);
        var.degradedQuality(var);
        Assert.assertEquals(0, var.getQuality());
        System.out.println("The new Quality value is " + var.getQuality());
    }
}
package com.pbz4esilv.gildedrose;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Sabrina on 09/10/2015.
 */
public class HighIncreasesItemTest {

    @Test // He increases in Quality the older it gets
    public void IncreaseQuality() throws Exception{
        IncreasesItem var = new IncreasesItem("blabla", 20, 18);
        var.increasesQuality(var);
        Assert.assertEquals(19, var.getQuality());
        System.out.println("IncreaseQuality : The new Quality value is " + var.getQuality());
    }
    @Test // Quality increases by 2 when there are 10 days or less
    public void testHighIncrease() throws Exception {
        HighIncreasesItem babare = new HighIncreasesItem("Backstage passes", 10, 20);
        babare.highIncrease(babare);
        Assert.assertEquals(22, babare.getQuality());
    }
    @Test // Quality increases by 3 when there are 5 days or less
    public void testHighIncrease1() throws Exception {
        HighIncreasesItem babare = new HighIncreasesItem("Backstage passes", 5, 20);
        babare.highIncrease(babare);
        Assert.assertEquals(23, babare.getQuality());
    }
    @Test // Quality drops to 0 after the concert
    public void testHighIncrease2() throws Exception {
        HighIncreasesItem babare = new HighIncreasesItem("Backstage passes", 0, 20);
        babare.highIncrease(babare);
        Assert.assertEquals(0, babare.getQuality());
    }
}
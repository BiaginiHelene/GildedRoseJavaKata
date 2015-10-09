package com.pbz4esilv.gildedrose;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Sabrina on 07/10/2015.
 */
public class IncreasesItemTest {

    @Test // He increases in Quality the older it gets
    public void IncreaseQuality() throws Exception{
        IncreasesItem var = new IncreasesItem("blabla", 20, 15);
        var.increasesQuality(var);
        Assert.assertEquals(16, var.getQuality());
        System.out.println("IncreaseQuality : The new Quality value is " + var.getQuality());
    }

    @Test // Once the sell by date has passed, Quality degrades twice as fast
    public void SellByDatePast() throws Exception{
        IncreasesItem var = new IncreasesItem("blabla", 0, 30);
        var.increasesQuality(var);
        Assert.assertEquals(28, var.getQuality());
        System.out.println("SellByDatePast : The new Quality value is " + var.getQuality());
    }

    @Test // Quality max
    public void qualityMax() throws Exception{
        IncreasesItem var = new IncreasesItem("blabla", 2, 50);
        var.increasesQuality(var);
        Assert.assertEquals(50, var.getQuality());
        System.out.println("qualityMax : The new Quality value is " + var.getQuality());
    }

}
package com.pbz4esilv.gildedrose;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Sabrina on 05/10/2015.
 */
public class LegendaryItemTest {

    @Test // Quality Test
    public void LegendaryItemQualityTest() throws Exception{
        LegendaryItem var = new LegendaryItem("Sulfuras, Hand of Ragnaros", 0, 80);
        var.staticQuality();
        Assert.assertEquals(80, var.getQuality());
    }

    @Test // SellIn Test
    public void LegendaryItemSellInTest() throws Exception{
        LegendaryItem var = new LegendaryItem("blabla", 0, 20);
        var.staticQuality();
        Assert.assertEquals(0, var.getSellIn());
    }
}
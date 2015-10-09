package com.pbz4esilv.gildedrose;

/**
 * Created by Sabrina on 06/10/2015.
 */
// This class used to admit items wich Quality degrades twice as fast as normal item
// "Backstage passes"

public class HighIncreasesItem extends Item {

    public HighIncreasesItem(String name, int sellIn, int quality) {

        super(name, sellIn, quality);
    }

    public void highIncrease(Item var){
        Item[] items = new Item[]{var};
        for (int i=0; i< items.length; i++) {
            if (items[i].getSellIn() == 0){
                var.setQuality(var.getQuality() - var.getQuality());
            }
            else if (items[i].getQuality() < 50) {
                items[i].setQuality(items[i].getQuality() + 1);
                if (var.getSellIn() < 11 && var.getQuality() < 50) {
                    var.setQuality(var.getQuality() + 1);
                }
                if (var.getSellIn() < 6 && var.getQuality() < 50) {
                    var.setQuality(var.getQuality() + 1);
                }
            }
        }
    }
}

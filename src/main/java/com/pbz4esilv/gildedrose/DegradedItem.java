package com.pbz4esilv.gildedrose;

/**
 * Created by Sabrina on 06/10/2015.
 */
// This class used to admit items wich Quality degrades normaly

public class DegradedItem extends Item {

    public DegradedItem(String name, int sellIn, int quality) {

        super(name, sellIn, quality);
    }

    public void degradedQuality(Item item1) {
        Item[] items = new Item[]{item1};

        for (int i=0; i< items.length; i++) {
            if (item1.getQuality() > 0) {
                item1.setQuality(item1.getQuality() - 1);
            }
            else {
                item1.setQuality(item1.getQuality() - item1.getQuality());
            }
        }
    }
}

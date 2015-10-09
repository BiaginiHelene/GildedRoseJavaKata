package com.pbz4esilv.gildedrose;

/**
 * Created by Sabrina on 05/10/2015.
 */
// This class is reserved for item wich never has to be sold or decreases in Quality
// "Sulfuras"

public class LegendaryItem extends Item {

    public LegendaryItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);

        this.quality = quality;
        this.sellIn = 0;
    }

    Item[] items = new Item[]{};

    public void staticQuality(){
        for (Item item:items){
            if (item.getQuality() > 51) {
                item.setQuality(item.getQuality());
                item.setSellIn(item.getSellIn());
            }
        }
    }


}




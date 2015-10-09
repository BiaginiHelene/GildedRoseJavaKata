package com.pbz4esilv.gildedrose;

/**
 * Created by Sabrina on 06/10/2015.
 */

//"Aged Brie"

public class IncreasesItem extends Item {

    private IncreasesItem[] items;

    public IncreasesItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public  void increasesQuality(Item var) {

        Item[] items = new Item[]{var};
        //System.out.println("taille " + items.length);

        for (int i=0; i< items.length; i++) {

           items[i].setSellIn(items[i].getSellIn() - 1);

            if (items[i].getQuality() < 50 && items[i].getSellIn()>0) {
                items[i].setQuality(items[i].getQuality() + 1);
            }
            else if (items[i].getQuality() < 50 && items[i].getSellIn() < 0){
                items[i].setQuality(items[i].getQuality()-2);
            }
        }
    }
}

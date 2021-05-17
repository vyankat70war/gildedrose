package com.gildedrose;

public class BackstagePassesItem extends Item {
    public BackstagePassesItem(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    void updateQuality() {
        super.updateQuality();
    }
}

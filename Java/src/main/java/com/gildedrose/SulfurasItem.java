package com.gildedrose;

public class SulfurasItem extends Item {
    public SulfurasItem(int sellIn, int quality) {
        super("Sulfuras, Hand of Ragnaros", sellIn, quality);
    }

    @Override
    void updateQuality() {
        super.updateQuality();
    }
}

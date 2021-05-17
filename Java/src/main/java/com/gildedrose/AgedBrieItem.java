package com.gildedrose;

public class AgedBrieItem extends Item {
    public AgedBrieItem(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    void updateQuality() {
        super.updateQuality();
    }
}

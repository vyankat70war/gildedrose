package com.gildedrose;

public class AgedBrieItem extends Item {
    public AgedBrieItem(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    void updateQuality() {
        if (quality < 50) {
            quality++;

        }

        sellIn--;

        if (sellIn < 0) {
            if (quality < 50) {
                quality++;
            }
        }
    }
}

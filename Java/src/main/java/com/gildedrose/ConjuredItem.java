package com.gildedrose;

public class ConjuredItem extends Item {
    public ConjuredItem(int sellIn, int quality) {
        super("Conjured", sellIn, quality);
    }

    @Override
    void updateQuality() {
        if (quality > 0) {
            quality -= 2;
            sellIn--;
            if (sellIn < 0) {
                if (quality > 0) {
                    quality -= 2;
                }
            }
        } else {
            sellIn--;
        }
    }
}

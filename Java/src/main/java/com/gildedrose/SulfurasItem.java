package com.gildedrose;

public class SulfurasItem extends Item {
    public SulfurasItem(int sellIn, int quality) {
        super("Sulfuras, Hand of Ragnaros", sellIn, quality);
    }

    @Override
    void updateQuality() {
        switch (name) {
            case AGED_BRIE:
                if (quality < 50) {
                    quality++;

                }

                sellIn--;

                if (sellIn < 0) {
                    if (quality < 50) {
                        quality++;
                    }
                }
                break;
            case BACKSTAGE_PASSES:
                if (quality < 50) {
                    quality++;

                    if (sellIn < 11) {
                        if (quality < 50) {
                            quality++;
                        }
                    }

                    if (sellIn < 6) {
                        if (quality < 50) {
                            quality++;
                        }
                    }
                }

                sellIn--;
                if (sellIn < 0) {
                    quality = 0;
                }
                break;
            case SULFURAS:

                break;
            default:
                if (quality > 0) {
                    quality--;
                    sellIn--;
                    if (sellIn < 0) {
                        if (quality > 0) {
                            quality--;
                        }
                    }
                } else {
                    sellIn--;
                }
                break;
        }
    }
}

package com.gildedrose;

public class Item {

    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

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
                    quality = quality - quality;
                }
                break;
            case SULFURAS:

                if (sellIn < 0) {
                    if (quality > 0) {
                        return;
                    }
                }
                break;
            default:
                if (quality > 0) {
                    quality--;
                }

                sellIn--;

                if (sellIn < 0) {
                    if (quality > 0) {
                        quality--;
                    }
                }
                break;
        }
    }
}

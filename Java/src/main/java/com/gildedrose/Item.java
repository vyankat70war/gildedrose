package com.gildedrose;

public class Item {

    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    public final String name;

    public int sellIn;

    public int quality;

    public Item(final String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;

    }

    public static Item createItem(Item item) {
        switch (item.name) {
            case AGED_BRIE:
                return new AgedBrieItem(item.sellIn, item.quality);
            case BACKSTAGE_PASSES:
                return new BackstagePassesItem(item.sellIn, item.quality);
            case SULFURAS:
                return new SulfurasItem(item.sellIn, item.quality);
            default:
                return new Item(item.name, item.sellIn, item.quality);
        }
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    void updateQuality() {
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
    }
}

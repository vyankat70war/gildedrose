package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0, itemsLength = items.length; i < itemsLength; i++) {
            items[i]  = Item.createItem(items[i]);
            items[i].updateQuality();
        }
    }

}

package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.approvaltests.combinations.CombinationApprovals.verifyAllCombinations;
class GildedRoseTest {
    @Test
    void foo() {
        verifyAllCombinations(
                this :: doUpdateQuality,
                new String[]  {"foo", "Aged Brie", "Backstage passes to a TAFKAL80ETC concert", "Sulfuras, Hand of Ragnaros"},
                new Integer[] { -1, 0, 2, 6, 11 },
                new Integer[] { 0, 1, 49, 50 } );
    }
    private String doUpdateQuality (String name, int sellIn, int quality) {
        Item[] items = new Item[] { new Item(name, sellIn, quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        return app.items[0].toString();
        //Testing mob
    }}
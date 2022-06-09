package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo1() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }

    @Test
    void foo2() {
        Item[] items = new Item[] { new Item("foo", 0, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(-1, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
    }

    @Test
    void foo3() {
        Item[] items = new Item[] { new Item("foo", 0, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(-1, app.items[0].sellIn);
        assertEquals(48, app.items[0].quality);
    }

    @Test
    void foo4() {
        Item[] items = new Item[] { new Item("foo", 10, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(9, app.items[0].sellIn);
        assertEquals(49, app.items[0].quality);
    }

    @Test
    void updateQualityForAgedBrieItems1() {
        Item[] items = new Item[] { new Item("Aged Brie", 0, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(-1, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
    }

    @Test
    void updateQualityForAgedBrieItems2() {
        Item[] items = new Item[] { new Item("Aged Brie", 0, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(-1, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
    }

    @Test
    void updateQualityForAgedBrieItems3() {
        Item[] items = new Item[] { new Item("Aged Brie", 2, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(1, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
    }

    @Test
    void updateQualityForAgedBrieItems4() {
        Item[] items = new Item[] { new Item("Aged Brie", 2, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(1, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
    }

    @Test
    void updateQualityForBackstagePassesItems1() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }

    @Test
    void updateQualityForBackstagePassesItems2() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }

    @Test
    void updateQualityForBackstagePassesItems3() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 15, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(14, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
    }

    @Test
    void updateQualityForBackstagePassesItems4() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 15, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(14, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
    }

    @Test
    void updateQualityForBackstagePassesItems5() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 6, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(5, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
    }

    @Test
    void updateQualityForBackstagePassesItems6() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 6, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(5, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
    }

    @Test
    void updateQualityForBackstagePassesItems7() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 2, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(1, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
    }

    @Test
    void updateQualityForBackstagePassesItems8() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 2, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(1, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
    }

    @Test
    void updateQualityForSulfarasItems1() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 0, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(0, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
    }

    @Test
    void updateQualityForSulfarasItems2() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", -1, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(-1, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
    }

    @Test
    void updateQualityForSulfarasItems3() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 2, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(2, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
    }

    @Test
    void updateQualityForConjuredItems1() {
        Item[] items = new Item[] { new Item("Conjured Mana Cake", 3, 6) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(2, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
    }

    @Test
    void updateQualityForConjuredItems2() {
        Item[] items = new Item[] { new Item("Conjured Mana Cake", 0, 6) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(-1, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
    }
}

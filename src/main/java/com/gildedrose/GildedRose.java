package com.gildedrose;

import java.util.Objects;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            UpdateQualityServiceUtil.updateQuality(item);
        }
    }
}

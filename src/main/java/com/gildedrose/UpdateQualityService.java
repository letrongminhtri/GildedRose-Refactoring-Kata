package com.gildedrose;

abstract class UpdateQualityService {
    protected static final int MAXIMUM_QUALITY = 50;

    void updateQuality(Item item) {
        updateAsNormal(item);
        updateSellIn(item);
        if (item.sellIn < 0) {
            updateAfterConcert(item);
        }
    }

    abstract void updateAsNormal(Item item);
    protected void updateSellIn(Item item) {
        item.sellIn -= 1;
    }
    abstract void updateAfterConcert(Item item);

    protected void increaseQualityByOneToMax(Item item) {
        item.quality = Math.min(item.quality + 1, MAXIMUM_QUALITY);
    }
}

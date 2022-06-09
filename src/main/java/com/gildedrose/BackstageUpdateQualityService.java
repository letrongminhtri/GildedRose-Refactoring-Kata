package com.gildedrose;

public class BackstageUpdateQualityService extends UpdateQualityService {
    @Override
    void updateAsNormal(Item item) {
        increaseQualityByOneToMax(item);

        if (item.sellIn <= 5) {
            item.quality = Math.min(item.quality + 2, MAXIMUM_QUALITY);
        } else if (item.sellIn <= 10) {
            increaseQualityByOneToMax(item);
        }
    }

    @Override
    void updateAfterConcert(Item item) {
        item.quality = 0;
    }
}

package com.gildedrose;

public class DefaultUpdateQualityService extends UpdateQualityService {
    @Override
    void updateAsNormal(Item item) {
        item.quality = Math.max(0, item.quality - 1);
    }

    @Override
    void updateAfterConcert(Item item) {
        item.quality = Math.max(0, item.quality - 1);
    }
}

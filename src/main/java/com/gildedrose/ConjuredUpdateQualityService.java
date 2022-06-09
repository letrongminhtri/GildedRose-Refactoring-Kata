package com.gildedrose;

public class ConjuredUpdateQualityService extends UpdateQualityService {
    @Override
    void updateAsNormal(Item item) {
        item.quality = Math.max(item.quality - 2, 0);
    }

    @Override
    void updateAfterConcert(Item item) {
        item.quality = Math.max(item.quality - 2, 0);
    }
}

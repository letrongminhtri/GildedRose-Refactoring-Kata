package com.gildedrose;

public class AgedBrieUpdateQualityService extends UpdateQualityService {
    @Override
    void updateAsNormal(Item item) {
        increaseQualityByOneToMax(item);
    }

    @Override
    void updateAfterConcert(Item item) {
        increaseQualityByOneToMax(item);
    }
}

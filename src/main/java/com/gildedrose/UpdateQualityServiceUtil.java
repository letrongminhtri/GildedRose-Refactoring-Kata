package com.gildedrose;

import java.util.HashMap;
import java.util.Map;

public class UpdateQualityServiceUtil {
    private static final UpdateQualityService DEFAULT_UPDATE_QUALITY_SERVICE = new DefaultUpdateQualityService();
    private static final Map<String, UpdateQualityService> UPDATE_QUALITY_SERVICE_MAP = new HashMap<String, UpdateQualityService>() {{
        put("Aged Brie", new AgedBrieUpdateQualityService());
        put("Backstage passes to a TAFKAL80ETC concert", new BackstageUpdateQualityService());
        put("Sulfuras, Hand of Ragnaros", new SulfurasUpdateQualityService());
        put("Conjured Mana Cake", new ConjuredUpdateQualityService());
    }};

    public static void updateQuality(Item item) {
        UpdateQualityService updateQualityService = getUpdateQualityService(item);
        updateQualityService.updateQuality(item);
    }

    private static UpdateQualityService getUpdateQualityService(Item item) {
        return UPDATE_QUALITY_SERVICE_MAP.getOrDefault(item.name, DEFAULT_UPDATE_QUALITY_SERVICE);
    }
}

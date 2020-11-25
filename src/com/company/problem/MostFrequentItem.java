package com.company.problem;

import java.util.HashMap;

public final class MostFrequentItem {
    private final Integer[] items;
    public MostFrequentItem(Integer[] items) {
        this.items = items;
    }

    public Integer exec() {
        int max_count = -1;
        Integer max_item = null;

        HashMap<Integer, Integer> occurMap = new HashMap<>();
        for (Integer item: items) {
            Integer itemOccurMap = occurMap.get(item);
            if (itemOccurMap != null) {
                itemOccurMap++;
                occurMap.replace(item, itemOccurMap);
            } else {
                itemOccurMap = 1;
                occurMap.put(item, itemOccurMap);
            }

            if (itemOccurMap > max_count) {
                max_count = itemOccurMap;
                max_item = item;
            }
        }

        return max_item;
    }
}

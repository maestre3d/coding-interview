package com.company.problem;

import java.util.ArrayList;

public final class CommonElements {
    private final int[] itemsN;
    private final int[] itemsM;

    public CommonElements(int[] itemsN, int[] itemsM) {
        this.itemsN = itemsN;
        this.itemsM = itemsM;
    }

    public int[] execBad() {
        // O(n, m^n) - time
        // O(n, m) - space
        // * Also works for unsorted vectors
        ArrayList<Integer> res = new ArrayList<>();
        for (Integer i: itemsN) {
            for (Integer j: itemsM) {
                if (!res.contains(i) && i.equals(j)) {
                    res.add(i);
                    break;
                }
            }
        }

        return res.stream().mapToInt(i -> i).toArray();
    }

    public Integer[] exec() {
        // O(n, m) - time
        // O(n, m) - space
        ArrayList<Integer> res = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        while (p1 < itemsN.length && p2 < itemsM.length) {
            if (itemsN[p1] == itemsM[p2]) {
                res.add(itemsN[p1]);
                p1 += 1;
                p2 += 1;
            } else if (itemsN[p1] > itemsM[p2]) {
                p2 += 1;
            } else {
                p1 += 1;
            }
        }

        Integer[] resArr = new Integer[res.size()];
        return res.toArray(resArr);
    }
}

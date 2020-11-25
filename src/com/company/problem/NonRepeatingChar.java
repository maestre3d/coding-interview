package com.company.problem;

import java.util.HashMap;

public class NonRepeatingChar {
    private final String givenString;

    public NonRepeatingChar(String givenString) {
        this.givenString = givenString;
    }

    public Character exec() {
        HashMap<Character, Integer> occurMap = new HashMap<>();
        for (Character item : givenString.toCharArray()) {
            Integer i = occurMap.get(item);
            if (i != null) {
                i++;
                occurMap.replace(item, i);
            } else {
                occurMap.put(item, 1);
            }
        }

        for (Character item: givenString.toCharArray()) {
            if (occurMap.get(item) == 1) {
                return item;
            }
        }

        return null;
    }
}

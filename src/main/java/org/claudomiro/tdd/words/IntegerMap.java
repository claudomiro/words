package org.claudomiro.tdd.words;

import java.util.HashMap;
import java.util.Map;

public abstract class IntegerMap {
    public final Map<Integer, String> tens;
    protected final Map<Integer, String> map;

    public IntegerMap() {
        map = new HashMap<>();
        tens = new HashMap<>();
    }

    protected abstract void initMap();

    public String wordRepresentation(Integer number) {
        if(!map.containsKey(number)) {
            throw new IllegalArgumentException(String.format("Number %d is not valid", number));
        }
        return map.get(number);
    }

    public boolean contains(Integer number) {
        return map.containsKey(number);
    }
}

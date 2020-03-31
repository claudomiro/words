package org.claudomiro.tdd.words;

import java.util.HashMap;
import java.util.Map;

public class WordConverter {

    private final UnitMap unitMap;

    public WordConverter() {
        unitMap = new UnitMap();
    }

    public String conv(int integer)
    {
        return unitMap.get(integer);
    }

}

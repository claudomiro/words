package org.claudomiro.tdd.words;

public class WordConverter {

    private final UnitMap unitMap;

    public WordConverter() {
        unitMap = new UnitMap();
    }

    public String conv(int integer)
    {
        return unitMap.getwordRepresentation(integer);
    }

}

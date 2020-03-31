package org.claudomiro.tdd.words;

public class WordConverter {

    private final UnitMap unitMap;
    private final TensMap tensMap;


    public WordConverter() {
        unitMap = new UnitMap();
        tensMap = new TensMap();
    }

    public String conv(int integer)
    {
        if(unitMap.contains(integer))
        {
            return unitMap.wordRepresentation(integer);
        }
        return tensMap.wordRepresentation(integer);
    }
}

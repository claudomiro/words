package org.claudomiro.tdd.words;

import java.util.ArrayList;
import java.util.List;

public class WordConverter {

    private final UnitMap unitMap;
    private final TensMap tensMap;


    public WordConverter() {
        unitMap = new UnitMap();
        tensMap = new TensMap();
    }

    public String conv(int integer)
    {
        int dezenas = integer /10 * 10;
        if(dezenas == 10) {
            dezenas = 0;
        }
        int unidades = integer -dezenas;

        List<String> result = new ArrayList<>();
        if(tensMap.contains(dezenas))
        {
            result.add(tensMap.wordRepresentation(dezenas));
        }
        if(unitMap.contains(unidades))
        {
            final String wordRepresentation = unitMap.wordRepresentation(unidades);
            if(result.isEmpty()) {
                result.add(wordRepresentation);
            } else if(unidades != 0) {
                result.add(wordRepresentation);
            }
        }
        return String.join(" e ", result);
    }
}

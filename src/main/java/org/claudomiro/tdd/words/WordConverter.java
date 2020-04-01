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

    public String conv(int value)
    {
        int dezenas = 0;
        if(value > 19) {
            dezenas = tensMap.adjustedValue(value);
        }
        int unidades = value - tensMap.realValue(dezenas);
        if(unitMap.containsNumber(value))
        {
            return unitMap.wordRepresentation(value);
        }
        if(tensMap.containsNumber(value) && unidades == 0)
        {
            return tensMap.wordRepresentation(dezenas);
        }
        return convertMixedValue(dezenas, unidades);
    }

    private String convertMixedValue(int dezenas, int unidades) {
        List<String> result = new ArrayList<>();
        if(tensMap.containsNumber(tensMap.realValue(dezenas)))
        {
            result.add(tensMap.wordRepresentation(dezenas));
        }
        if(unitMap.containsNumber(unitMap.realValue(unidades)))
        {
                result.add(unitMap.wordRepresentation(unidades));
        }
        return String.join(" e ", result);
    }
}

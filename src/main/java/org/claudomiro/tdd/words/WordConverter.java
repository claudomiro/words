package org.claudomiro.tdd.words;

import org.claudomiro.tdd.words.maps.IntegerMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordConverter {
    private final Map<Integer, String> exceptionMap ;

    private final IntegerMap unitMap;
    private final IntegerMap tensMap;

    public WordConverter() {
        unitMap = IntegerMap.unitMap();
        tensMap = IntegerMap.tenfoldMap();
        exceptionMap = new HashMap<>();
        this.init();
    }

    private void init() {
        exceptionMap.put(0, "zero");
        exceptionMap.put(10, "dez");
        exceptionMap.put(11, "onze");
        exceptionMap.put(12, "doze");
        exceptionMap.put(13, "treze");
        exceptionMap.put(14, "quatorze");
        exceptionMap.put(15, "quinze");
        exceptionMap.put(16, "dezesseis");
        exceptionMap.put(17, "dezessete");
        exceptionMap.put(18, "dezoito");
        exceptionMap.put(19, "dezenove");
    }

    private boolean isException(int value)
    {
        return exceptionMap.get(value) != null;
    }

    public String conv(int value)
    {
        if(isException(value))
        {
            return exceptionMap.get(value);
        }
        int tens = tensMap.tens(value);
        int units = unitMap.units(value);
        if(units == 0)
        {
            return tensMap.wordRepresentation(tens);
        }
        if(tens == 0)
        {
            return unitMap.wordRepresentation(units);
        }
        return convertMixedValue(tens, units);
    }

    private String convertMixedValue(int dezenas, int unidades) {
        List<String> result = new ArrayList<>();
        if(tensMap.containsNumber(dezenas))
        {
            result.add(tensMap.wordRepresentation(dezenas));
        }
        if(unitMap.containsNumber(unidades))
        {
                result.add(unitMap.wordRepresentation(unidades));
        }
        return String.join(" e ", result);
    }

}

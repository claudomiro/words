package org.claudomiro.tdd.words;

import org.claudomiro.tdd.words.maps.IntegerMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntegerConverter {
    private final Map<Integer, String> exceptionMap ;

    private final IntegerMap unitMap;
    private final IntegerMap tensMap;

    public IntegerConverter() {
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

    public String conv(int value)
    {
        if(value < 0 || value > 99)
        {
            throw new IllegalArgumentException(String.format("Don't know how to convert '%d'", value));
        }
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

    private String convertMixedValue(int tens, int units) {
        List<String> result = new ArrayList<>();
        if(tensMap.containsNumber(tens))
        {
            result.add(tensMap.wordRepresentation(tens));
        }
        if(unitMap.containsNumber(units))
        {
                result.add(unitMap.wordRepresentation(units));
        }
        return String.join(" e ", result);
    }

    private boolean isException(int value)
    {
        return exceptionMap.containsKey(value);
    }

}

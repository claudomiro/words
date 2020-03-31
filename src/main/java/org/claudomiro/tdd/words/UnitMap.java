package org.claudomiro.tdd.words;

import java.util.HashMap;
import java.util.Map;

public class UnitMap
{
    private final Map<Integer, String> units ;


    public UnitMap() {
        units = new HashMap<>();
        initMap();
    }

    public String getwordRepresentation(Integer number) {
        if(!units.containsKey(number)) {
            throw new IllegalArgumentException(String.format("Number %d is not unit", number));
        }
        return units.get(number);
    }

    private void initMap() {
        units.put(0, "zero");
        units.put(1, "um");
        units.put(2, "dois");
        units.put(3, "três");
        units.put(4, "quatro");
        units.put(5, "cinco");
        units.put(6, "seis");
        units.put(7, "sete");
        units.put(8, "oito");
        units.put(9, "nove");
        units.put(10, "dez");
        units.put(11, "onze");
        units.put(12, "doze");
        units.put(13, "treze");
        units.put(14, "quatorze");
        units.put(15, "quinze");
        units.put(16, "dezesseis");
        units.put(17, "dezessete");
        units.put(18, "dezoito");
        units.put(19, "dezenove");
    }

}

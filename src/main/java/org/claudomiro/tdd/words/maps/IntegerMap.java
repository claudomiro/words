package org.claudomiro.tdd.words.maps;

import java.util.HashMap;
import java.util.Map;

public abstract class IntegerMap {

    public static IntegerMap tenfoldMap()
    {
      return new TensMap();
    }

    public static IntegerMap unitMap()
    {
        return new UnitMap();
    }

    protected final Map<Integer, String> map;

    public IntegerMap() {
        map = new HashMap<>();
    }

    protected abstract void initMap();

    public int tens(int value)
    {
        return digitToExtract(value, 2);
    }

    public int units(int value)
    {
        return digitToExtract(value, 1);
    }

    private int digitToExtract(int value, int digitPosition) {
        final String stringRepresentation = Integer.toString(value);
        final int size = stringRepresentation.length();
        if(size < digitPosition)
        {
            return 0;
        }
        int position = size - digitPosition;
        final String digit = stringRepresentation.substring(position, position + 1);
        return new Integer(digit);
    }

    public String wordRepresentation(Integer number) {
        return map.get(number);
    }

    public boolean containsNumber(Integer number) {
        return map.containsKey(number);
    }

}

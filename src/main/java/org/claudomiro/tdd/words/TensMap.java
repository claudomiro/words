package org.claudomiro.tdd.words;

public class TensMap extends IntegerMap
{
    public static final int TEN = 10;

    public TensMap()
    {
        super();
        initMap();
    }

    @Override
    protected int base() {
        return TEN;
    }

    @Override
    public int realValue(int original)
    {
        return original * TEN;
    }

    @Override
    public int adjustedValue(int original)
    {
        return original / TEN;
    }

    @Override
    protected void initMap() 
    {
        map.put(2, "vinte");
        map.put(3, "trinta");
        map.put(4, "quarenta");
        map.put(5, "cinquenta");
        map.put(6, "sessenta");
        map.put(7, "setenta");
        map.put(8, "oitenta");
        map.put(9, "noventa");

    }

}

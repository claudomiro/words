package org.claudomiro.tdd.words;

public class TensMap extends IntegerMap
{
    public TensMap()
    {
        super();
        initMap();
    }

    @Override
    protected void initMap() 
    {
        map.put(20, "vinte");
        map.put(30, "trinta");
        map.put(40, "quarenta");
        map.put(50, "cinquenta");
        map.put(60, "sessenta");
        map.put(70, "setenta");
        map.put(80, "oitenta");
        map.put(90, "noventa");

    }
}

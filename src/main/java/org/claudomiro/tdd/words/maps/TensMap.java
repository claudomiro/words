package org.claudomiro.tdd.words.maps;

public class TensMap extends IntegerMap
{
    protected TensMap()
    {
        super();
        initMap();
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

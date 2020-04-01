package org.claudomiro.tdd.words.maps;

public class UnitMap extends IntegerMap {

    protected UnitMap() {
        super();
        initMap();
    }

    @Override
    protected void initMap() {
        map.put(1, "um");
        map.put(2, "dois");
        map.put(3, "três");
        map.put(4, "quatro");
        map.put(5, "cinco");
        map.put(6, "seis");
        map.put(7, "sete");
        map.put(8, "oito");
        map.put(9, "nove");
    }

}

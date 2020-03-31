package org.claudomiro.tdd.words;

public class UnitMap extends IntegerMap {


    public UnitMap() {
        super();
        initMap();

    }

    @Override
    protected void initMap() {
        map.put(0, "zero");
        map.put(1, "um");
        map.put(2, "dois");
        map.put(3, "três");
        map.put(4, "quatro");
        map.put(5, "cinco");
        map.put(6, "seis");
        map.put(7, "sete");
        map.put(8, "oito");
        map.put(9, "nove");
        map.put(10, "dez");
        map.put(11, "onze");
        map.put(12, "doze");
        map.put(13, "treze");
        map.put(14, "quatorze");
        map.put(15, "quinze");
        map.put(16, "dezesseis");
        map.put(17, "dezessete");
        map.put(18, "dezoito");
        map.put(19, "dezenove");
    }
}

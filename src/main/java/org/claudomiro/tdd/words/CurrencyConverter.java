package org.claudomiro.tdd.words;

public class CurrencyConverter
{
    private final IntegerConverter integerConverter;

    public CurrencyConverter() {
        integerConverter = new IntegerConverter();
    }

    public String conv(double currencyValue)
    {
        int integerValue = (int) currencyValue;

        return integerConverter.conv(integerValue) + " reais";
    }
}

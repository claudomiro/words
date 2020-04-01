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
        int centsValue = (int) ((currencyValue - integerValue) *  100.00);

        if(centsValue == 0) {
            return integerConverter.conv(integerValue) + " reais";
        }
        return integerConverter.conv(centsValue) + " centavos";
    }
}

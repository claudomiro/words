package org.claudomiro.tdd.words;

import static org.claudomiro.tdd.words.PortugueseConstants.*;

public class CurrencyConverter
{
    private final IntegerConverter integerConverter;

    public CurrencyConverter() {
        integerConverter = new IntegerConverter();
    }

    public String conv(double currencyValue)
    {
        int integerPart = (int) currencyValue;
        int centsPart = (int) ((currencyValue - integerPart) * ONE_HUNDRED);

        if(centsPart == 0) {
            return integerConverter.conv(integerPart) + SPACE + CURRENCY;
        }
        return integerConverter.conv(centsPart) + SPACE + CENTS;
    }
}

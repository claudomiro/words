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
        int integerValue = (int) currencyValue;
        int centsValue = (int) ((currencyValue - integerValue) * ONE_HUNDRED);

        if(centsValue == 0) {
            return integerConverter.conv(integerValue) + SPACE + CURRENCY;
        }
        return integerConverter.conv(centsValue) + SPACE + CENTS;
    }
}

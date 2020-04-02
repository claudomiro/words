package org.claudomiro.tdd.words;

import java.util.ArrayList;
import java.util.List;

import static org.claudomiro.tdd.words.PortugueseConstants.*;

public class CurrencyConverter
{
    private final IntegerConverter integerConverter;

    public CurrencyConverter() {
        integerConverter = new IntegerConverter();
    }

    public String conv(double currencyValue)
    {
        List<String> resultList = new ArrayList<>();
        int integerPart = (int) currencyValue;
        final double doubleValue = currencyValue - (double) integerPart;
        int centsPart = (int) Math.round(doubleValue * ONE_HUNDRED);

        if(integerPart != 0)
        {
            resultList.add(integerConverter.conv(integerPart) + SPACE + CURRENCY);
        }
        if(centsPart != 0)
        {
            resultList.add(integerConverter.conv(centsPart) + SPACE + CENTS);
        }
        return String.join(SPACE + CONECTOR + SPACE, resultList);
    }
}

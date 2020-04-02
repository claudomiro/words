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
            String stringCurrencyPart = integerConverter.conv(integerPart) + SPACE ;
            if(integerPart == 1) {
                stringCurrencyPart += CURRENCY_SINGULAR;
            } else
            {
                stringCurrencyPart += CURRENCY_PLURAL;
            }
            resultList.add(stringCurrencyPart);
        }
        if(centsPart != 0)
        {
            String stringCentsPart = integerConverter.conv(centsPart) + SPACE ;
            if(centsPart == 1)
            {
                stringCentsPart += CENT_SINGULAR;
            } else
            {
                stringCentsPart += CENT_PLURAL;
            }
            resultList.add(stringCentsPart);
        }
        return String.join(SPACE + CONECTOR + SPACE, resultList);
    }
}

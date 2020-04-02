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
            resultList.add(stringPart(integerPart, CURRENCY_SINGULAR, CURRENCY_PLURAL));
        }
        if(centsPart != 0)
        {
            resultList.add(stringPart(centsPart, CENT_SINGULAR, CENT_PLURAL));
        }
        return String.join(SPACE + CONECTOR + SPACE, resultList);
    }

    private String stringPart(int integerNumber, String singularWord, String pluralWord) {
        String stringPart = integerConverter.conv(integerNumber) + SPACE;
        if (integerNumber == 1) {
            return stringPart + singularWord;
        }
        return stringPart + pluralWord;
    }

}

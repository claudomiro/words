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
        int currencyInCents = (int) (currencyValue * ONE_HUNDRED);
        int integerPart = currencyInCents / 100;
        int centsPart = currencyInCents - (integerPart * 100);

        List<String> resultList = new ArrayList<>();
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

package org.claudomiro.tdd.words;

import java.util.ArrayList;
import java.util.List;

import static org.claudomiro.tdd.words.PortugueseConstants.*;

public class CurrencyConverter
{
    private static final double DOUBLE_ONE_HUNDRED = 100.00;
    private  static final int INT_ONE_HUNDRED = 100;

    private final IntegerConverter integerConverter;

    public CurrencyConverter() {
        integerConverter = new IntegerConverter();
    }

    public String conv(double currencyValue)
    {
        if(currencyValue < 0.00 || currencyValue > 99.99999999999)
        {
            throw new IllegalArgumentException(String.format("Don't know how to convert '%f'", currencyValue));
        }
        int currencyInCents = (int) (currencyValue * DOUBLE_ONE_HUNDRED);
        int integerPart = currencyInCents / INT_ONE_HUNDRED;
        int centsPart = currencyInCents - (integerPart * INT_ONE_HUNDRED);

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
